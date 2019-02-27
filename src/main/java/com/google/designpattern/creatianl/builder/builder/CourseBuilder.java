package com.google.designpattern.creatianl.builder.builder;

import com.google.designpattern.creatianl.builder.pojo.Course;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  CourseBuilder
 * @date : 2019/2/20 0020
 * @time : 10:59
 * @createTime 2019-02-20 10:59
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public abstract class CourseBuilder {

    /**
     * 获取课程名称
     *
     * @param courseName
     */
    public abstract void buildCourseName(String courseName);

    /**
     * 获取课件
     *
     * @param coursePowerPoint
     */
    public abstract void buildCoursePowerPoint(String coursePowerPoint);

    /**
     * 获取视频
     *
     * @param courseVideo
     */
    public abstract void buildCourseVideo(String courseVideo);

    /**
     * 获取博客
     *
     * @param courseArticle
     */
    public abstract void buildCourseArticle(String courseArticle);

    /**
     * 获取问题和答案
     *
     * @param courseQuestionAndAnswer
     */
    public abstract void buildCourseQuestionAndAnswer(String courseQuestionAndAnswer);

    /**
     * 制作课程
     *
     * @return
     */
    public abstract Course makeCourse();
}
