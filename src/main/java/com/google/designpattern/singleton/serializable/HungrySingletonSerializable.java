package com.google.designpattern.singleton.serializable;

import java.io.Serializable;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  HungrySingletonSerializable
 * @date : 2019/2/25 0025
 * @time : 9:53
 * @createTime 2019-02-25 9:53
 * @version : 2.0
 * @description :
 *
 *   <p>长生问题:</p>
 *   <p></p>
 *   <p></p>
 *   <p></p>
 *   <p></p>
 *   <p></p>
 *
 *******************************/

public class HungrySingletonSerializable implements Serializable {


    private final static HungrySingletonSerializable hungrySingletonSerializable = new HungrySingletonSerializable();

    private HungrySingletonSerializable() {
    }


    public static HungrySingletonSerializable getHungrySingletonInstance() {
        return hungrySingletonSerializable;
    }

    /**
     * 需要添加此方法,通过反射得到的方法,需要阅读源码
     *
     * @return
     */
    private Object readResolve() {
        return hungrySingletonSerializable;
    }

}
