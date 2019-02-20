package com.google.designpattern.builder.pojo;

import com.google.designpattern.builder.builder.CourseBuilder;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  Coach
 * @date : 2019/2/20 0020
 * @time : 13:34
 * @createTime 2019-02-20 13:34
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    /**
     * 制造课程
     * 需要收集材料组装起来
     *
     * @param courseName
     * @param coursePowerPoint
     * @param courseVideo
     * @param courseArticle
     * @param courseQuestionAndAnswer
     * @return
     */
    public Course makeCourse(String courseName,
                             String coursePowerPoint,
                             String courseVideo,
                             String courseArticle,
                             String courseQuestionAndAnswer) {

        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePowerPoint(coursePowerPoint);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQuestionAndAnswer(courseQuestionAndAnswer);
        return this.courseBuilder.makeCourse();
    }


}
