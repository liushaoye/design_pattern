package com.google.designpattern.singleton.lazypattern.a$baseversion;

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


public class LazySingleton {

    /**
     * 初始化对象
     */
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    /**
     * 初始化单线程单例模式
     *
     * @return
     */
    public static LazySingleton getLazySingletonInstance() {
        if (StringUtils.isEmpty(lazySingleton)) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }

    /**
     * 第一种锁法
     *
     * @return
     */
    public synchronized static LazySingleton getLazySingletonInstanceSynchronized1() {
        if (StringUtils.isEmpty(lazySingleton)) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }

    /**
     * 第二种锁法,与第一种相同
     * 弊端消耗资源
     *
     * @return
     */
    public static LazySingleton getLazySingletonInstanceSynchronized2() {
        synchronized (LazySingleton.class) {
            if (StringUtils.isEmpty(lazySingleton)) {
                lazySingleton = new LazySingleton();
            }
            return lazySingleton;
        }
    }
}
