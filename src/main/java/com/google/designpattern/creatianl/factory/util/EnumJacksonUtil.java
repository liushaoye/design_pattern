package com.google.designpattern.creatianl.factory.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.List;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  EnumJacksonUtil
 * @date : 2019/2/26 0026
 * @time : 9:45
 * @createTime 2019-02-26 9:45
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Slf4j
public enum EnumJacksonUtil {

    /**
     * 方法集合
     */
    INSTANCE {

        /**
         * 转成json
         * @param object 传入的实体类
         * @return
         */
        @Override
        public String toJsonString(Object object) {
            String json = null;
            if (!StringUtils.isEmpty(object)) {
                try {
                    log.info("传入对象:" + object);
                    json = mapper.writeValueAsString(object);
                    log.info("转换结果:" + json);
                } catch (JsonProcessingException e) {
                    log.info("json转换异常{}" + object);
                    e.getMessage();
                }
            }
            return json;
        }

        /**
         *
         * @param jsonStr 传入的字符串
         * @param cls   传入的实体类
         * @return
         */
        @Override
        public <T> T stringToBean(String jsonStr, Class<T> cls) {
            T t = null;
            if (!StringUtils.isEmpty(mapper)) {
                try {
                    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
                    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    t = mapper.readValue(jsonStr, cls);
                } catch (IOException e) {
                    log.info("json转换异常{}" + jsonStr);
                    e.getMessage();
                }
            }
            return t;
        }

        /**
         * 将json数据转换成pojo对象list
         * @param jsonData
         * @param beanType
         * @param <T>
         * @return
         */
        @Override
        public <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
            JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, beanType);
            try {
                List<T> list = mapper.readValue(jsonData, javaType);
                return list;
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }
    };

    /**
     * springboot转换json的类
     */
    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    /**
     * 转成json
     *
     * @param object 传入的实体类
     * @return
     */
    public abstract String toJsonString(Object object);

    /**
     * 转成bean
     *
     * @param jsonStr 传入的字符串
     * @param cls     传入的实体类
     * @return
     */
    public abstract <T> T stringToBean(String jsonStr, Class<T> cls);

    /**
     * 将json数据转换成pojo对象list
     *
     * @param jsonData
     * @param beanType
     * @param <T>
     * @return
     */
    public abstract <T> List<T> jsonToList(String jsonData, Class<T> beanType);


    public static EnumJacksonUtil getInstance() {
        return INSTANCE;
    }

}
