package com.google.designpattern.utils;

import com.google.designpattern.creatianl.factory.b$personal.company.pojo.Thermo;
import com.google.designpattern.creatianl.factory.util.EnumJacksonUtil;
import com.google.designpattern.creatianl.factory.util.JacksonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnumApplicationTests {

    @Test
    public void contextLoads() {

        Thermo thermo = new Thermo( );
        thermo.setName("塞米菲");
        thermo.setDescribe("一起一个");

        EnumJacksonUtil enumJacksonUtil = EnumJacksonUtil.getInstance();
        System.out.println( enumJacksonUtil.toJsonString(thermo));
    }

    @Test
    public void contextLoad2s() {

        Thermo thermo = new Thermo( );
        thermo.setName("塞米菲");
        thermo.setDescribe("一起一个");

        System.out.println(JacksonUtil.toJsonString(thermo));
    }

}

