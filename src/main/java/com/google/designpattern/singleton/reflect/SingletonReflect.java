package com.google.designpattern.singleton.reflect;

import org.springframework.util.StringUtils;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  SingletonReflect
 * @date : 2019/2/25 0025
 * @time : 14:29
 * @createTime 2019-02-25 14:29
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class SingletonReflect {


    private final static SingletonReflect singletonReflect = new SingletonReflect();

    /**
     * 这里是重点
     */
    private SingletonReflect() {

        if (StringUtils.isEmpty(singletonReflect)) {
            throw new RuntimeException("单例构造器,禁止反射调用");
        }

    }

    /**
     * 返回结果
     *
     * @return
     */
    public static SingletonReflect getSingletonReflect() {
        return singletonReflect;
    }
}
