package com.google.designpattern.singleton.reflect;

import org.springframework.util.StringUtils;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  LazySingleton
 * @date : 2019/2/21 0021
 * @time : 11:19
 * @createTime 2019-02-21 11:19
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class LazySingletonReflect2 {

    /**
     * 初始化对象
     */
    private static LazySingletonReflect2 lazySingleton = null;

    private static boolean flag = true;

    private LazySingletonReflect2() {
        if(flag){
            flag=false;
        }else {
            throw new RuntimeException("单例构造器,禁止反射调用");
        }
    }

    /**
     * 初始化单线程单例模式
     *
     * @return
     */
    public static LazySingletonReflect2 getLazySingletonInstance() {
        if (StringUtils.isEmpty(lazySingleton)) {
            lazySingleton = new LazySingletonReflect2();
        }

        return lazySingleton;
    }
}
