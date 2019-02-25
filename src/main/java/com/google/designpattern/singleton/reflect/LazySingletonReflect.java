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


public class LazySingletonReflect {

    /**
     * 初始化对象
     */
    private static LazySingletonReflect lazySingleton = null;

    private LazySingletonReflect() {
        if (StringUtils.isEmpty(lazySingleton)) {
            throw new RuntimeException("单例构造器,禁止反射调用");
        }
    }

    /**
     * 初始化单线程单例模式
     *
     * @return
     */
    public static LazySingletonReflect getLazySingletonInstance() {
        if (StringUtils.isEmpty(lazySingleton)) {
            lazySingleton = new LazySingletonReflect();
        }

        return lazySingleton;
    }

    /**
     * 第一种锁法
     *
     * @return
     */
    public synchronized static LazySingletonReflect getLazySingletonInstanceSynchronized1() {
        if (StringUtils.isEmpty(lazySingleton)) {
            lazySingleton = new LazySingletonReflect();
        }

        return lazySingleton;
    }

    /**
     * 第二种锁法,与第一种相同
     * 弊端消耗资源
     *
     * @return
     */
    public static LazySingletonReflect getLazySingletonInstanceSynchronized2() {
        synchronized (LazySingletonReflect.class) {
            if (StringUtils.isEmpty(lazySingleton)) {
                lazySingleton = new LazySingletonReflect();
            }
            return lazySingleton;
        }
    }
}
