package io.elastic.salesforce.actions;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

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
}
