package com.google.designpattern.builder.builder.impl;

import com.google.designpattern.builder.builder.CourseBuilder;
import com.google.designpattern.builder.pojo.Course;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  CourseActualBuilder
 * @date : 2019/2/20 0020
 * @time : 11:14
 * @createTime 2019-02-20 11:14
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePowerPoint(String coursePowerPoint) {
        course.setCoursePowerPoint(coursePowerPoint);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQuestionAndAnswer(String courseQuestionAndAnswer) {
        course.setCourseQuestionAndAnswer(courseQuestionAndAnswer);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
