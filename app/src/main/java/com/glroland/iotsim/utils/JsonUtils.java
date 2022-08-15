package com.glroland.iotsim.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JsonUtils {
    
    public static String beanToJson(Object bean) {
        ObjectMapper mapper = new ObjectMapper();
        try {
           return mapper.writeValueAsString(bean);
        } catch(JsonProcessingException e) {
            throw new RuntimeException("Unable to convert bean to Json", e);
        }

    }
}
