package com.google.designpattern.creatianl.factory.c$factorymethod;

import com.google.designpattern.creatianl.factory.b$formal.AbstractVideo;
import com.google.designpattern.creatianl.factory.b$formal.FeVideo;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  FeVideoFactory
 * @date : 2019/2/18 0018
 * @time : 11:14
 * @createTime 2019-02-18 11:14
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class FeVideoFactory extends AbstractVideoFactory {

    @Override
    public AbstractVideo getVideo() {
        return new FeVideo();
    }
}
