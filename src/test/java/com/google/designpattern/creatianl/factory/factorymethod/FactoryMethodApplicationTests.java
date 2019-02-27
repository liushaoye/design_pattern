package com.google.designpattern.creatianl.factory.factorymethod;

import com.google.designpattern.creatianl.factory.c$factorymethod.AbstractVideoFactory;
import com.google.designpattern.creatianl.factory.c$factorymethod.FeVideoFactory;
import com.google.designpattern.creatianl.factory.c$factorymethod.JavaVideoFactory;
import com.google.designpattern.creatianl.factory.c$factorymethod.PythonVideoFactory;
import com.google.designpattern.creatianl.factory.b$formal.AbstractVideo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryMethodApplicationTests {

    /**
     * 需要每次new的对象不同
     */
    @Test
    public void testFactoryMethod() {

        AbstractVideoFactory abstractVideoFactory = new JavaVideoFactory();
        AbstractVideo abstractVideo = abstractVideoFactory.getVideo();
        abstractVideo.product();

        AbstractVideoFactory abstractVideoFactory1 = new PythonVideoFactory();
        abstractVideoFactory1.getVideo().product();


        AbstractVideoFactory abstractVideoFactory2 = new FeVideoFactory();
        abstractVideoFactory2.getVideo().product();

    }

}

