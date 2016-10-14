package io.elastic.salesforce;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.elastic.api.Component;
import io.elastic.api.EventEmitter;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractSalesforceComponent extends Component {

    private static final Logger logger = LoggerFactory.getLogger(AbstractSalesforceComponent.class);

    /**
     * Creates a component instance with the given {@link EventEmitter}.
     *
     * @param eventEmitter emitter to emit events
     */
    public AbstractSalesforceComponent(EventEmitter eventEmitter) {
        super(eventEmitter);
    }

    protected final JsonObject queryObjects(final JsonObject configuration,
                                            final String query) {

        final HttpGet get = HttpClientUtils.createQueryRequest(configuration, query);

        final String content = sendRequestAndRefreshTokensIfRequired(get, configuration);

        final JsonObject object = new JsonParser().parse(content).getAsJsonObject();

        final String total = object.get("totalSize").getAsString();

        logger.info("Retrieved {} objects", total);

        return object;
    }

    protected final JsonObject postObject(final JsonObject configuration,
                                          final String objectType,
                                          final JsonObject body) {

        final HttpPost httpPost = HttpClientUtils.createPostObjectRequest(
                configuration, objectType, body);

        final String content = sendRequestAndRefreshTokensIfRequired(httpPost, configuration);

        final JsonObject object = new JsonParser().parse(content).getAsJsonObject();

        return object;
    }

    private String sendRequestAndRefreshTokensIfRequired(
            final HttpRequestBase request, final JsonObject configuration) {

        try {
            return HttpClientUtils.sendRequest(request);
        } catch (AuthorizationException e) {

            HttpClientUtils.refreshTokens(configuration);

            logger.info("Emitting updated keys");

            getEventEmitter().emitUpdateKeys(configuration);

            HttpClientUtils.authorizeRequest(request, configuration);

            logger.info("Sending the original request width refreshed access_token");
            try {
                return HttpClientUtils.sendRequest(request);
            } catch (AuthorizationException e1) {
                throw new RuntimeException(e1);
            }

        }
    }

}
