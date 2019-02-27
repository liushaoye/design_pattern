package com.google.designpattern.creatianl.builder.builder2;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  Course2
 * @date : 2019/2/20 0020
 * @time : 13:55
 * @createTime 2019-02-20 13:55
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class Course2 {
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


    public Course2(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePowerPoint = courseBuilder.coursePowerPoint;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseQuestionAndAnswer = courseBuilder.courseQuestionAndAnswer;
    }

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

    public static class CourseBuilder {

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


        /**
         * 获取课程名称
         *
         * @param courseName
         */
        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        /**
         * 获取课件
         *
         * @param coursePowerPoint
         */
        public CourseBuilder buildCoursePowerPoint(String coursePowerPoint) {
            this.coursePowerPoint = coursePowerPoint;
            return this;
        }

        /**
         * 获取视频
         *
         * @param courseVideo
         */
        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        /**
         * 获取博客
         *
         * @param courseArticle
         */
        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        /**
         * 获取问题和答案
         *
         * @param courseQuestionAndAnswer
         */
        public CourseBuilder buildCourseQuestionAndAnswer(String courseQuestionAndAnswer) {
            this.courseQuestionAndAnswer = courseQuestionAndAnswer;
            return this;
        }

        /**
         * 制作课程
         *
         * @return
         */
        public Course2 makeCourse() {
            return new Course2(this);
        }
    }

}
