package io.elastic.salesforce.triggers;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.elastic.api.EventEmitter;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Message;
import io.elastic.salesforce.AbstractSalesforceComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueryObjects extends AbstractSalesforceComponent {

    public static final Logger logger = LoggerFactory.getLogger(QueryObjects.class);

    /**
     * Creates a component instance with the given {@link EventEmitter}.
     *
     * @param eventEmitter emitter to emit events
     */
    public QueryObjects(EventEmitter eventEmitter) {
        super(eventEmitter);
    }

    @Override
    public void execute(final ExecutionParameters parameters) {

        final JsonObject configuration = parameters.getConfiguration();

        logger.info(configuration.toString());

        final JsonElement query = configuration.get("query");
        final String queryString = query.getAsString();

        logger.info("About to query objects: {}", queryString);

        final JsonObject body = queryObjects(configuration, queryString);

        final Message response
                = new Message.Builder().body(body).build();

        getEventEmitter().emitData(response);

        logger.info("Finished execution");

    }
}
