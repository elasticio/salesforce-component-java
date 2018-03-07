package io.elastic.salesforce.actions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import io.elastic.api.EventEmitter;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Message;
import io.elastic.api.Module;
import io.elastic.salesforce.actions.JAXB.Catalog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.json.Json;
import javax.json.JsonObject;
import java.io.IOException;

public class Submit implements Module {
    private static final Logger logger = LoggerFactory.getLogger(Submit.class);

    @Override
    public void execute(ExecutionParameters parameters) {
        logger.info("Starting to parse input message");

        final Message message = parameters.getMessage();
        final JsonObject body = message.getBody();
        final JsonObject config = parameters.getConfiguration();
        final JsonObject response;

        EventEmitter emitter = parameters.getEventEmitter();

        try {
            String xml = getXML(body);

            response = Json.createObjectBuilder()
                    .add("XML", xml)
                    .build();

            logger.info(xml);

            emitter.emitData(new Message.Builder().body(response).build());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            emitter.emitException(e);
        }

    }

    public static String getXML(JsonObject body) throws IOException, ClassNotFoundException {

        Catalog catalog;

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JaxbAnnotationModule());

        catalog = (Catalog) mapper.readValue(body.toString(), Class.forName("io.elastic.salesforce.actions.JAXB.Catalog"));

        return Utils.marshal(catalog);
    }
}
