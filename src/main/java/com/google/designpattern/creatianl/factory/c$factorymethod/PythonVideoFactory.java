package com.google.designpattern.creatianl.factory.c$factorymethod;

import com.google.designpattern.creatianl.factory.b$formal.AbstractVideo;
import com.google.designpattern.creatianl.factory.b$formal.PythonVideo;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  PythonVideoFactory
 * @date : 2019/2/15 0015
 * @time : 18:33
 * @createTime 2019-02-15 18:33
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class PythonVideoFactory extends AbstractVideoFactory {

    @Override
    public AbstractVideo getVideo() {
        return new PythonVideo();
    }
}
