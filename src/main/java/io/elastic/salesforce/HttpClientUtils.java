package io.elastic.salesforce;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class HttpClientUtils {

    public static final Logger logger = LoggerFactory.getLogger(HttpClientUtils.class);

    private static final String API_BASE_PATH = "/services/data/v37.0";


    public static final HttpGet createQueryRequest(final JsonObject configuration,
                                                   final String query) {

        final String requestURI = getInstanceBaseUri(configuration) + "/query?q=" + encodeQuery(query);

        final HttpGet httpGet = new HttpGet(requestURI);
        httpGet.addHeader("Accept", "application/json");

        HttpClientUtils.authorizeRequest(httpGet, configuration);

        return httpGet;
    }

    public static HttpPost createPostObjectRequest(final JsonObject configuration,
                                                   final String objectType,
                                                   final JsonObject body) {

        final String baseUri = getInstanceBaseUri(configuration);

        final String requestURI = String.format("%s/sobjects/%s", baseUri, objectType);

        final HttpPost httpPost = new HttpPost(requestURI);
        httpPost.addHeader(HTTP.CONTENT_TYPE, "application/json");
        try {
            httpPost.setEntity(new StringEntity(body.toString()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        HttpClientUtils.authorizeRequest(httpPost, configuration);

        return httpPost;
    }

    private static JsonObject getOAuth(final JsonObject configuration) {
        if (configuration == null) {
            throw new RuntimeException("Component configuration is missing");
        }

        final JsonObject oauth = configuration.get(Constants.CONFIGURATION_OAUTH).getAsJsonObject();

        if (oauth == null) {
            throw new RuntimeException("Please authenticate with Salesforce");
        }

        return oauth;
    }

    private static final String getInstanceBaseUri(final JsonObject configuration) {

        final JsonObject oauth = configuration.get(Constants.CONFIGURATION_OAUTH).getAsJsonObject();

        if (oauth == null) {
            throw new RuntimeException("Please authenticate with Salesforce");
        }

        final String instanceUrl = getRequiredConfigurationParameter(
                oauth, Constants.CONFIGURATION_INSTANCE_URL);

        logger.info("Instance url: {}", instanceUrl);

        return instanceUrl + API_BASE_PATH;
    }

    public static void authorizeRequest(final HttpRequestBase request,
                                        final JsonObject configuration) {

        logger.info("Adding Authorization header to request");

        final JsonObject oauth = getOAuth(configuration);

        final String accessToken = getRequiredConfigurationParameter(
                oauth, Constants.CONFIGURATION_ACCESS_TOKEN);

        request.setHeader("Authorization", "Bearer " + accessToken);

    }


    public static final String sendRequest(final HttpRequestBase request) throws AuthorizationException {

        final CloseableHttpClient httpClient = HttpClients.custom()
                .setSSLSocketFactory(createSSLConnectionSocketFactory())
                .build();

        try {
            final CloseableHttpResponse response = httpClient.execute(request);
            final HttpEntity responseEntity = response.getEntity();
            final StatusLine statusLine = response.getStatusLine();
            final int statusCode = statusLine.getStatusCode();

            if (statusCode == 401) {
                logger.info("Received {} response", statusCode);
                throw new AuthorizationException();
            }

            if (responseEntity == null) {
                throw new RuntimeException("Null response received");
            }

            final String result = EntityUtils.toString(responseEntity);

            if (statusCode != 200) {
                throw new RuntimeException(result);
            }

            EntityUtils.consume(responseEntity);

            return result;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                logger.error("Failed to close HttpClient", e);
            }
        }
    }


    public static final void refreshTokens(final JsonObject configuration) {

        logger.info("About to refresh tokens");

        final JsonObject oauth = configuration.get(Constants.CONFIGURATION_OAUTH).getAsJsonObject();

        if (oauth == null) {
            throw new RuntimeException("Please authenticate with Salesforce");
        }

        final String refreshToken = getRequiredConfigurationParameter(
                oauth, Constants.CONFIGURATION_REFRESH_TOKEN);

        final List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("grant_type", "refresh_token"));
        params.add(new BasicNameValuePair("client_id", System.getenv("SALESFORCE_KEY")));
        params.add(new BasicNameValuePair("client_secret", System.getenv("SALESFORCE_SECRET")));
        params.add(new BasicNameValuePair("refresh_token", refreshToken));
        params.add(new BasicNameValuePair("format", "json"));

        final String url = "https://login.salesforce.com/services/oauth2/token";

        final HttpPost httpPost = new HttpPost(url);
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }


        final String content;
        try {
            content = HttpClientUtils.sendRequest(httpPost);
        } catch (AuthorizationException e) {
            throw new RuntimeException(e);
        }

        logger.info("Refresh token response: {}", content);

        final JsonObject newOauth = new JsonParser().parse(content).getAsJsonObject();

        configuration.add(Constants.CONFIGURATION_OAUTH, newOauth);
    }

    /**
     * This method is a temporary fix until we migrate platform to JDK 1.8
     * which is compatible with TLS 1.1 or higher by default.
     */
    private static final SSLConnectionSocketFactory createSSLConnectionSocketFactory() {
        SSLContext sslContext = null;
        try {
            sslContext = SSLContexts.custom()
                    .useTLS()
                    .build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return new SSLConnectionSocketFactory(
                sslContext,
                new String[]{"TLSv1.1", "TLSv1.2"},
                null,
                SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    private static final String getRequiredConfigurationParameter(final JsonObject configuration,
                                                                  final String name) {
        final JsonElement value = configuration.get(name);

        if (value == null) {
            throw new RuntimeException(String.format("Parameter '%s' is required", name));
        }

        return value.getAsString();
    }

    private final static String encodeQuery(final String query) {
        try {
            return URLEncoder.encode(query, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
