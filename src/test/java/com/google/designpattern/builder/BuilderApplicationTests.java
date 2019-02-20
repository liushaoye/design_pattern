package com.google.designpattern.builder;

import com.google.common.collect.ImmutableSet;
import com.google.designpattern.builder.builder.CourseBuilder;
import com.google.designpattern.builder.builder.impl.CourseActualBuilder;
import com.google.designpattern.builder.builder2.Course2;
import com.google.designpattern.builder.pojo.Coach;
import com.google.designpattern.builder.pojo.Course;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BuilderApplicationTests {

    /**
     * 方便的链式调用
     */
    @Test
    public void testBuilder() {

        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("课程:MrLiu",
                "课件:MrLiu.ppt",
                "视频:MrLiu.avi",
                "文章:MrLiu.txt",
                "问答:MrLiu答疑");

        log.info("结果是:" + course);

    }

    @Test
    public void testBuilder2() {

        Course2 course2 = new Course2.CourseBuilder().
                buildCourseName("课程:MrLiu").
                buildCoursePowerPoint("课件:MrLiu.ppt").
                buildCourseVideo("视频:MrLiu.avi").
                buildCourseArticle("文章:MrLiu.txt").
                buildCourseQuestionAndAnswer("问答:MrLiu答疑").makeCourse();

        log.info("结果是:" + course2);
    }

    @Test
    public void testBuilder3() {
        Set<String> set = ImmutableSet.<String>builder()
                .add("a").add("b").build();

        log.info("结果是:" + set);
    }

}

