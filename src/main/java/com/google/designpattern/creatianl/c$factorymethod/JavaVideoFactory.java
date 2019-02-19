package com.google.designpattern.creatianl.c$factorymethod;

import com.google.designpattern.creatianl.b$formal.AbstractVideo;
import com.google.designpattern.creatianl.b$formal.JavaVideo;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  JavaVideoFactory
 * @date : 2019/2/15 0015
 * @time : 18:32
 * @createTime 2019-02-15 18:32
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class JavaVideoFactory extends AbstractVideoFactory {

    @Override
    public AbstractVideo getVideo() {
        return new JavaVideo();
    }
}
