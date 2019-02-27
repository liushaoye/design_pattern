package com.google.designpattern.creatianl.singleton.container.nothreadsafe;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  ContainerSingleton
 * @date : 2019/2/26 0026
 * @time : 14:33
 * @createTime 2019-02-26 14:33
 * @version : 2.0
 * @description :
 *
 *      容器单例模式
 *
 *      程序初始化的时候,把多个单例对象放入singletonMap中
 *      new HashTable是线程安全的,但是会消耗性能
 *
 *     优点:同一管理,map相当于一个缓存
 *     缺点:map线程不安全
 *******************************/


public class ContainerSingleton {

    private static Map<String, Object> singletonMap = new HashMap<>(16);

    private ContainerSingleton() {
    }

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNoneBlank(key) && !org.springframework.util.StringUtils.isEmpty(instance)) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }


    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }


}
