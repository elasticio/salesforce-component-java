package io.elastic.salesforce.actions;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import io.elastic.salesforce.actions.JAXB.Catalog;

import javax.json.JsonObject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class Utils {

    public static ObjectMapper createJaxbObjectMapper()
    {
        final ObjectMapper mapper = new ObjectMapper();
        final TypeFactory typeFactory = mapper.getTypeFactory();
        final AnnotationIntrospector introspector = new JaxbAnnotationIntrospector(typeFactory);
        mapper.getDeserializationConfig().with(introspector);
        mapper.getSerializationConfig().with(introspector);
        mapper.registerModule(new JaxbAnnotationModule());
        return mapper;
    }

    public static String marshal(final Object input) {
        final Marshaller marshaller = createMarshaller();

        final StringWriter writer = new StringWriter();

        try {
            marshaller.marshal(input, writer);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

        return writer.toString();
    }
    private static Marshaller createMarshaller() {
        try {
            final JAXBContext context = JAXBContext.newInstance(Catalog.class);

            return context.createMarshaller();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getVal(JsonObject jsonObject, String key) {
        return jsonObject.getString(key);
    }

    public static SFTPUtils getSFTPClient(JsonObject conf) {
        SFTPUtils sftpUtils = new SFTPUtils();
        sftpUtils.setHostName(getVal(conf, "hostname"));
        sftpUtils.setHostPort(getVal(conf, "port"));
        sftpUtils.setUserName(getVal(conf, "username"));
        sftpUtils.setPassWord(getVal(conf, "password"));
        sftpUtils.setDestinationDir(getVal(conf, "destDir"));
        return sftpUtils;
    }

}
