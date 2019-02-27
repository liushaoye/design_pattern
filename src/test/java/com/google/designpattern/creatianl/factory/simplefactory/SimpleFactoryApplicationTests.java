package com.google.designpattern.creatianl.factory.simplefactory;

import com.google.designpattern.creatianl.factory.b$formal.AbstractVideo;
import com.google.designpattern.creatianl.factory.b$formal.PythonVideo;
import com.google.designpattern.creatianl.factory.a$simplefactory.VideoFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleFactoryApplicationTests {

    /**
     * 需要每次new的对象不同
     */
    @Test
    public void testSimpleFactory() {

        // 创建工厂
        VideoFactory videoFactory = new VideoFactory();

        // 传入需要传入的值
        AbstractVideo abstractVideo = videoFactory.getVideo("java");

        if (abstractVideo == null) {
            return;
        }
        abstractVideo.product();

    }

    @Test
    public void testSimpleFactoryFlex() {
        // 创建工厂
        VideoFactory videoFactory = new VideoFactory();

        // 传入需要传入的值
        AbstractVideo abstractVideo =videoFactory.getVideoFlex(PythonVideo.class);

        if (abstractVideo == null) {
            return;
        }
        abstractVideo.product();
    }

}

