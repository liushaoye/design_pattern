package com.google.designpattern.singleton.lazypattern.c$versionthree;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  StaticInnerClassSingleton
 * @date : 2019/2/22 0022
 * @time : 14:24
 * @createTime 2019-02-22 14:24
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class StaticInnerClassSingleton {

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    /**
     * 必须要有private构造函数,否则就会被new出来
     */
    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

}
