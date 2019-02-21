package com.google.designpattern.singleton.b$versiontwo;

import org.springframework.util.StringUtils;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  LazyDoubleCheckSingleton
 * @date : 2019/2/21 0021
 * @time : 16:32
 * @createTime 2019-02-21 16:32
 * @version : 2.0
 * @description :
 *
 *
 *******************************/

public class LazyDoubleCheckSingleton {

    /**
     * 初始化对象,需要加volatile来控制线程安全
     */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    /**
     * 初始化双重检查模式
     * 可以大大降低内存消耗
     *
     * @return
     */
    public static LazyDoubleCheckSingleton getLazyDoubleCheckSingletonInstance() {

        //不为空直接返回
        if (StringUtils.isEmpty(lazyDoubleCheckSingleton)) {
            // 为空加锁,单线程进入
            synchronized (LazyDoubleCheckSingleton.class) {
                if (StringUtils.isEmpty(lazyDoubleCheckSingleton)) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();

                    // 1.分配内存给这个对象
                    // 3.设置LazyDoubleCheckSingleton指向刚分配的内存空间
                    // 2.初始化对象
                }
            }
        }

        return lazyDoubleCheckSingleton;
    }
}
