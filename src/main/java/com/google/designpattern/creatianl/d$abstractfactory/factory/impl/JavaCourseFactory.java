package com.google.designpattern.creatianl.d$abstractfactory.factory.impl;

import com.google.designpattern.creatianl.d$abstractfactory.base.AbstractArticle;
import com.google.designpattern.creatianl.d$abstractfactory.base.AbstractVideoVersion;
import com.google.designpattern.creatianl.d$abstractfactory.factory.CourseFactory;
import com.google.designpattern.creatianl.d$abstractfactory.pojo.JavaArticle;
import com.google.designpattern.creatianl.d$abstractfactory.pojo.JavaVideoVersion;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  JavaCourseFactory
 * @date : 2019/2/19 0019
 * @time : 11:33
 * @createTime 2019-02-19 11:33
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class JavaCourseFactory implements CourseFactory {

    @Override
    public AbstractVideoVersion getAbstractVideoVersion() {
        return new JavaVideoVersion();
    }

    @Override
    public AbstractArticle getAbstractArticle() {
        return new JavaArticle();
    }
}
