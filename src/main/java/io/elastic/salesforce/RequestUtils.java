package io.elastic.salesforce;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class RequestUtils {

    public static final Logger logger = LoggerFactory.getLogger(RequestUtils.class);

    private static final String API_BASE_PATH = "/services/data/v37.0/query";

    public static final JsonObject queryObjects(final JsonObject configuration,
                                                final String query) {

        final HttpGet get = createQueryRequest(configuration, query);

        final String content = RequestUtils.sendRequest(get);

        System.err.println(content);

        final JsonObject object = new JsonParser().parse(content).getAsJsonObject();

        final String total = object.get("totalSize").getAsString();

        logger.info("Retrieved {} objects", total);

        return object;
    }

    public static final HttpGet createQueryRequest(final JsonObject configuration,
                                                   final String query) {

        final JsonObject oauth = configuration.get(Constants.CONFIGURATION_OAUTH).getAsJsonObject();

        if (oauth == null) {
            throw new RuntimeException("Please authenticate with Salesforce");
        }

        final String instanceUrl = getRequiredConfigurationParameter(
                oauth, Constants.CONFIGURATION_INSTANCE_URL);
        final String accessToken = getRequiredConfigurationParameter(
                oauth, Constants.CONFIGURATION_ACCESS_TOKEN);

        logger.info("Instance url: {}", instanceUrl);

        final String baseURI = instanceUrl + API_BASE_PATH;

        final String requestURI = baseURI + "?q=" + encodeQuery(query);

        final HttpGet httpGet = new HttpGet(requestURI);
        httpGet.addHeader("Accept", "application/json");
        httpGet.addHeader("Authorization", "Bearer " + accessToken);

        return httpGet;
    }

    public static final String sendRequest(final HttpUriRequest request) {

        final CloseableHttpClient httpClient = HttpClients.custom()
                .setSSLSocketFactory(createSSLConnectionSocketFactory())
                .build();

        try {
            final CloseableHttpResponse response = httpClient.execute(request);
            final HttpEntity responseEntity = response.getEntity();
            final StatusLine statusLine = response.getStatusLine();
            final int statusCode = statusLine.getStatusCode();

            if (statusCode == 401) {
                throw new RuntimeException("Refresh token");
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
                e.printStackTrace();
            }
        }
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
