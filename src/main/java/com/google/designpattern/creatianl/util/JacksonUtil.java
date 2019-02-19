package com.google.designpattern.creatianl.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @Author 海想着你
 * @Date 2018/7/16
 */
@Slf4j
public class JacksonUtil {

    private static ObjectMapper mapper;

    static {
        //noinspection ConstantConditions
        if (mapper == null) {
            mapper = new ObjectMapper();
        }
    }

    /**
     * 转成json
     *
     * @param object
     * @return
     */
    public static String toJsonString(Object object) {
        String json = null;
        if (object != null) {
            try {
                json = mapper.writeValueAsString(object);
            } catch (JsonProcessingException e) {
                log.info("json转换异常{}" + object);
                e.getMessage();
            }
        }
        return json;
    }

    /**
     * 转成bean
     *
     * @param jsonStr
     * @param cls
     * @return
     */
    public static <T> T stringToBean(String jsonStr, Class<T> cls) {
        T t = null;
        if (mapper != null) {
            try {
                mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
                mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                t = mapper.readValue(jsonStr, cls);
            } catch (IOException e) {
                e.getMessage();
            }
        }
        return t;
    }
}

