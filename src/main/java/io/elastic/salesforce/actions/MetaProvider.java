package io.elastic.salesforce.actions;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.elastic.api.DynamicMetadataProvider;
import io.elastic.salesforce.actions.JAXB.Catalog;

import javax.json.Json;
import javax.json.JsonReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MetaProvider implements DynamicMetadataProvider {
    @Override
    public javax.json.JsonObject getMetaModel(javax.json.JsonObject configuration) {
        try {
            return deserialize(getMeta());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    javax.json.JsonObject deserialize(byte[] content) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(content);
             JsonReader reader = Json.createReader(bais)) {

            return reader.readObject();
        }
    }

    public byte[] getMeta() {
        JsonObject result = new JsonObject();
        JsonParser parser = new JsonParser();
        JsonElement in;
        JsonSchema inSchema;
        ObjectMapper objectMapper = Utils.createJaxbObjectMapper();
        try {
            inSchema = objectMapper.generateJsonSchema(Catalog.class);
            in = parser.parse(inSchema.toString());

            result.add("in", in);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        }
        return result.toString().getBytes();
    }
}
