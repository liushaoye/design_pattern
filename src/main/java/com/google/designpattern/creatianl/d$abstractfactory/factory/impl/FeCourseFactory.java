package com.google.designpattern.creatianl.d$abstractfactory.factory.impl;

import com.google.designpattern.creatianl.d$abstractfactory.base.AbstractArticle;
import com.google.designpattern.creatianl.d$abstractfactory.base.AbstractVideoVersion;
import com.google.designpattern.creatianl.d$abstractfactory.factory.CourseFactory;
import com.google.designpattern.creatianl.d$abstractfactory.pojo.FeArticle;
import com.google.designpattern.creatianl.d$abstractfactory.pojo.FeVideoVersion;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  FeCourseFactory
 * @date : 2019/2/19 0019
 * @time : 11:41
 * @createTime 2019-02-19 11:41
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class FeCourseFactory implements CourseFactory {

    @Override
    public AbstractVideoVersion getAbstractVideoVersion() {
        return new FeVideoVersion();
    }

    @Override
    public AbstractArticle getAbstractArticle() {
        return new FeArticle();
    }
}
