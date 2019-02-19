package com.google.designpattern.creational.abstractfactory;

import com.google.designpattern.creatianl.d$abstractfactory.base.AbstractArticle;
import com.google.designpattern.creatianl.d$abstractfactory.factory.CourseFactory;
import com.google.designpattern.creatianl.d$abstractfactory.factory.impl.FeCourseFactory;
import com.google.designpattern.creatianl.d$abstractfactory.factory.impl.JavaCourseFactory;

import com.google.designpattern.creatianl.d$abstractfactory.factory.impl.PythonCourseFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FactoryApplicationTests {

    /**
     * 需要每次new的对象不同
     */
    @Test
    public void testAbstractFactory() {

        // 创建工厂
        CourseFactory courseFactory1 = new JavaCourseFactory();
        AbstractArticle abstractArticle = courseFactory1.getAbstractArticle();
        abstractArticle.product();
        courseFactory1.getAbstractVideoVersion().product();

        CourseFactory courseFactory2 = new PythonCourseFactory();
        courseFactory2.getAbstractArticle().product();
        courseFactory2.getAbstractVideoVersion().product();

        CourseFactory courseFactory3 = new FeCourseFactory();
        courseFactory3.getAbstractArticle().product();
        courseFactory3.getAbstractVideoVersion().product();
    }

}

