package io.elastic.salesforce.triggers;

import com.google.gson.JsonObject;
import io.elastic.api.Component;
import io.elastic.api.EventEmitter;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetAccounts extends Component {

    public static final Logger logger = LoggerFactory.getLogger(GetAccounts.class);

    /**
     * Creates a component instance with the given {@link io.elastic.api.EventEmitter}.
     *
     * @param eventEmitter emitter to emit events
     */
    public GetAccounts(EventEmitter eventEmitter) {
        super(eventEmitter);
    }

    @Override
    public void execute(final ExecutionParameters parameters) {

        final JsonObject configuration = parameters.getConfiguration();

        logger.info(configuration.toString());

        final JsonObject body = new JsonObject();

        final Message response
                = new Message.Builder().body(body).build();

        getEventEmitter().emitData(response);

    }
}
