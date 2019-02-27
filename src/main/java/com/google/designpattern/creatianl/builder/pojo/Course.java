package com.google.designpattern.creatianl.builder.pojo;

import lombok.Data;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  Course
 * @date : 2019/2/19 0019
 * @time : 15:00
 * @createTime 2019-02-19 15:00
 * @version : 2.0
 * @description :
 *
 *      课程实体类
 *
 *******************************/
@Data
public class Course {

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 课程PPT
     */
    private String coursePowerPoint;

    /**
     * 课程视频
     */
    private String courseVideo;

    /**
     * 课程文章
     */
    private String courseArticle;

    /**
     * 问答
     */
    private String courseQuestionAndAnswer;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePowerPoint='" + coursePowerPoint + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQuestionAndAnswer='" + courseQuestionAndAnswer + '\'' +
                '}';
    }
}
