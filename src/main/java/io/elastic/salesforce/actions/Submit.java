package io.elastic.salesforce.actions;

import io.elastic.api.ExecutionParameters;
import io.elastic.api.Message;
import io.elastic.api.Module;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.json.JsonObject;

public class Submit implements Module {
    private static final Logger logger = LoggerFactory.getLogger(Submit.class);

    @Override
    public void execute(ExecutionParameters parameters) {
        logger.info("Starting to parse input message");

        final Message message = parameters.getMessage();
        final JsonObject body = message.getBody();
        final JsonObject config = parameters.getConfiguration();



    }
}
