package com.google.designpattern.singleton.hungrypattern.b$baseversiontwo;

import com.google.designpattern.singleton.hungrypattern.a$baseversion.HungrySingleton;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  HungrySingletonStatic
 * @date : 2019/2/22 0022
 * @time : 16:48
 * @createTime 2019-02-22 16:48
 * @version : 2.0
 * @description :
 *
 *    静态代码块加载
 *
 *******************************/

public class HungrySingletonStatic {

    private final static HungrySingletonStatic hungrySingletonStatic;


    static {
        hungrySingletonStatic = new HungrySingletonStatic();
    }

    private HungrySingletonStatic() {
    }

    /**
     * 优点:写法简单,类加载的时候就完成了初始化,避免了线程同步问题
     * 缺点:在类加载的时候就加载了,没有延迟加载的效果,从始至终没用过,造成内存的浪费
     *
     * @return
     */
    public static HungrySingletonStatic getHungrySingletonStaticInstance() {
        return hungrySingletonStatic;
    }


}
