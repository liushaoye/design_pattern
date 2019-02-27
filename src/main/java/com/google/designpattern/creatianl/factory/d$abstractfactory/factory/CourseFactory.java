package com.google.designpattern.creatianl.factory.d$abstractfactory.factory;

import com.google.designpattern.creatianl.factory.d$abstractfactory.base.AbstractArticle;
import com.google.designpattern.creatianl.factory.d$abstractfactory.base.AbstractVideoVersion;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  CourseFactory
 * @date : 2019/2/19 0019
 * @time : 11:22
 * @createTime 2019-02-19 11:22
 * @version : 2.0
 * @description :
 *
 *   课程 =  视频+ 文章
 *
 *******************************/


public interface CourseFactory {

    /**
     * 获取视频
     *
     * @return
     */
    AbstractVideoVersion getAbstractVideoVersion();

    /**
     * 获取文章
     *
     * @return
     */
    AbstractArticle getAbstractArticle();
}
