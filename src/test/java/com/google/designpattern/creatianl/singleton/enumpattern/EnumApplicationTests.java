package com.google.designpattern.creatianl.singleton.enumpattern;

import com.google.designpattern.creatianl.singleton.enumpattern.demoone.EnumSingleton;
import com.google.designpattern.creatianl.singleton.enumpattern.demotwo.EnumSingleton2;
import com.google.designpattern.creatianl.singleton.hungrypattern.b$baseversiontwo.HungrySingletonStatic;
import com.google.designpattern.creatianl.singleton.serializable.HungrySingletonSerializable;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class EnumApplicationTests {


    /**
     * 枚举防序列化
     */
    @Test
    public void getEnum() throws IOException, ClassNotFoundException {
        EnumSingleton enumSingleton = EnumSingleton.getInstance();

        // 序列化到一个文件中,再从文件中取出来,是否还是同一个对像
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(enumSingleton);

        // 读取文件
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        EnumSingleton newInstance = (EnumSingleton) ois.readObject();
        log.error("初始创建:" + enumSingleton);
        log.error("新的对象:" + newInstance);
        log.error(enumSingleton == newInstance ? "等" : "不等");
    }


    /**
     * 查看data是否相等
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Test
    public void getEnumDate() throws IOException, ClassNotFoundException {
        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        enumSingleton.setData(new Object());

        // 序列化到一个文件中,再从文件中取出来,是否还是同一个对像
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(enumSingleton);

        // 读取文件
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        EnumSingleton newInstance = (EnumSingleton) ois.readObject();
        log.error("初始创建:" + enumSingleton.getData());
        log.error("新的对象:" + newInstance.getData());
        log.error(enumSingleton.getData() == newInstance.getData() ? "等" : "不等");
    }


    /**
     * 枚举第二版
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Test
    public void getEnumDate2() {
        EnumSingleton2 enumSingleton = EnumSingleton2.getInstance();
        enumSingleton.printTest();

        log.error("初始创建:" + enumSingleton.getData());
    }
}

