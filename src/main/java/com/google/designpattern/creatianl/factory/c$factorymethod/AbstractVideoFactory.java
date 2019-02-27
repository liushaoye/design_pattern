package com.google.designpattern.creatianl.factory.c$factorymethod;

import com.google.designpattern.creatianl.factory.b$formal.AbstractVideo;

/******************************
 * @author : liuyang
 * <p>ProjectName:designpattern  </p>
 * @ClassName :  AbstractVideoFactory
 * @date : 2019/2/15 0015
 * @time : 18:25
 * @createTime 2019-02-15 18:25
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public abstract class AbstractVideoFactory {

    /**
     * 获取结果
     *
     * @return
     */
    public abstract AbstractVideo getVideo();
}
