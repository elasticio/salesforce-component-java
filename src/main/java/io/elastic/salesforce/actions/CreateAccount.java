package io.elastic.salesforce.actions;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.elastic.api.EventEmitter;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Message;
import io.elastic.salesforce.AbstractSalesforceComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateAccount extends AbstractSalesforceComponent {

    private static final Logger logger = LoggerFactory.getLogger(CreateAccount.class);
    /**
     * Creates a component instance with the given {@link EventEmitter}.
     *
     * @param eventEmitter emitter to emit events
     */
    public CreateAccount(EventEmitter eventEmitter) {
        super(eventEmitter);
    }

    @Override
    public void execute(ExecutionParameters parameters) {

        final JsonObject configuration = parameters.getConfiguration();
        final Message message = parameters.getMessage();

        final JsonObject account = message.getBody();

        final JsonObject result = postObject(configuration, "Account", account);

        final JsonElement id = result.get("id");

        logger.info("Created account with id {}", id);

        final Message response
                = new Message.Builder().body(account).build();

        getEventEmitter().emitData(response);

    }
}
