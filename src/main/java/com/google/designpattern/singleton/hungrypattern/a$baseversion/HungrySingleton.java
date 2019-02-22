package com.google.designpattern.singleton.hungrypattern.a$baseversion;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  HungrySingleton
 * @date : 2019/2/22 0022
 * @time : 16:22
 * @createTime 2019-02-22 16:22
 * @version : 2.0
 * @description :
 *
 *
 *******************************/

public class HungrySingleton {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    /**
     * 优点:写法简单,类加载的时候就完成了初始化,避免了线程同步问题
     * 缺点:在类加载的时候就加载了,没有延迟加载的效果,从始至终没用过,造成内存的浪费
     *
     * @return
     */
    public static HungrySingleton getHungrySingletonInstance() {
        return hungrySingleton;
    }
}
