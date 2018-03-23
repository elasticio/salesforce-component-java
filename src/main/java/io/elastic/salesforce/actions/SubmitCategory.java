package io.elastic.salesforce.actions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import io.elastic.api.EventEmitter;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Message;
import io.elastic.api.Module;
import io.elastic.salesforce.actions.JAXB.category.Catalog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.json.Json;
import javax.json.JsonObject;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;

import static io.elastic.salesforce.actions.Utils.getSFTPClient;

public class SubmitCategory implements Module {
    private static final Logger logger = LoggerFactory.getLogger(SubmitCategory.class);

    @Override
    public void execute(ExecutionParameters parameters) {
        logger.info("Starting to parse input message");

        final Message message = parameters.getMessage();
        final JsonObject body = message.getBody();
        final JsonObject config = parameters.getConfiguration();
        final String response;

        EventEmitter emitter = parameters.getEventEmitter();

        try {

            response = uploadToSFTP(getXML(body), config);

            emitter.emitData(
                    new Message.Builder().body(Json.createObjectBuilder()
                    .add("response", response)
                    .build()).build());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            emitter.emitException(e);
        } catch (SftpException e) {
            e.printStackTrace();
        } catch (JSchException e) {
            e.printStackTrace();
        }

    }

    public static String getXML(JsonObject body) throws IOException, ClassNotFoundException {

        Catalog catalog;

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JaxbAnnotationModule());

        catalog = (Catalog) mapper.readValue(body.toString(), Class.forName("io.elastic.salesforce.actions.JAXB.category.Catalog"));

        return Utils.marshal(catalog, Catalog.class);
    }

    public static String uploadToSFTP(String xml, JsonObject conf) throws SftpException, JSchException, IOException {
        String result;
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        SFTPUtils sftpUtils = getSFTPClient(conf);
        result = sftpUtils.uploadFileToFTP(getFilename(), is, true);

        return result;
    }

    private static String getFilename() {
        StringBuilder result = new StringBuilder();
        result.append("LT_DemandwareProduct_(");
        result.append(new SimpleDateFormat("yyyy-MMM-dd.HH.mm.ss").format(new java.util.Date()));
        result.append(").xml");
        return result.toString();
    }

}
