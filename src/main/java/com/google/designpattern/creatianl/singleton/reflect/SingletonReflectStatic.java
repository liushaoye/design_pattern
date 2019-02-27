package com.google.designpattern.creatianl.singleton.reflect;

import org.springframework.util.StringUtils;

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

public class SingletonReflectStatic {

    private final static SingletonReflectStatic hungrySingletonStatic;


    static {
        hungrySingletonStatic = new SingletonReflectStatic();
    }

    private SingletonReflectStatic() {

        if (StringUtils.isEmpty(hungrySingletonStatic)) {
            throw new RuntimeException("单例构造器,禁止反射调用");
        }
    }

    /**
     * 优点:写法简单,类加载的时候就完成了初始化,避免了线程同步问题
     * 缺点:在类加载的时候就加载了,没有延迟加载的效果,从始至终没用过,造成内存的浪费
     *
     * @return
     */
    public static SingletonReflectStatic getHungrySingletonStaticInstance() {
        return hungrySingletonStatic;
    }


}
