package com.google.designpattern.creatianl.factory.d$abstractfactory.factory.impl;

import com.google.designpattern.creatianl.factory.d$abstractfactory.base.AbstractArticle;
import com.google.designpattern.creatianl.factory.d$abstractfactory.base.AbstractVideoVersion;
import com.google.designpattern.creatianl.factory.d$abstractfactory.factory.CourseFactory;
import com.google.designpattern.creatianl.factory.d$abstractfactory.pojo.PythonArticle;
import com.google.designpattern.creatianl.factory.d$abstractfactory.pojo.PythonVideoVersion;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  PythonCourseFactory
 * @date : 2019/2/19 0019
 * @time : 11:40
 * @createTime 2019-02-19 11:40
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class PythonCourseFactory implements CourseFactory {


    @Override
    public AbstractVideoVersion getAbstractVideoVersion() {
        return new PythonVideoVersion();
    }

    @Override
    public AbstractArticle getAbstractArticle() {
        return new PythonArticle();
    }
}
