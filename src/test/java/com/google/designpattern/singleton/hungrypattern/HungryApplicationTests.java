package com.google.designpattern.singleton.hungrypattern;

import com.google.designpattern.singleton.hungrypattern.b$baseversiontwo.HungrySingletonStatic;
import com.google.designpattern.singleton.serializable.HungrySingletonSerializable;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class HungryApplicationTests {


    /**
     * 饿汉式没有系列化
     */
    @Test
    public void getNoHungry() throws IOException, ClassNotFoundException {
        HungrySingletonStatic hungrySingletonStatic = HungrySingletonStatic.getHungrySingletonStaticInstance();

        // 序列化到一个文件中,再从文件中取出来,是否还是同一个对像
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(hungrySingletonStatic);

        // 读取文件
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingletonStatic newInstance = (HungrySingletonStatic) ois.readObject();
        log.error("初始创建:" + hungrySingletonStatic);
        log.error("新的对象:" + newInstance);
        log.error(hungrySingletonStatic == newInstance ? "等" : "不等");
    }

    /**
     * 单例序列化测试,有序列化报错
     * 增加了readResolve(),就相等了
     */
    @Test
    public void getHungry() throws IOException, ClassNotFoundException {


        HungrySingletonSerializable hungrySingletonSerializable = HungrySingletonSerializable.getHungrySingletonInstance();

        // 序列化到一个文件中,再从文件中取出来,是否还是同一个对像
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(hungrySingletonSerializable);

        // 读取文件
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));


        // readObject()->readObject0()->checkResolve(readOrdinaryObject(unshared))->isInstantiable()->>阅读其注释
        // readObject0()->hasReadResolveMethod()->>注释声明要定义readResolve方法
        //ObjectStreamClass()定义了这个方法的写法
        HungrySingletonSerializable newInstance = (HungrySingletonSerializable) ois.readObject();
        log.error("初始创建:" + hungrySingletonSerializable);
        log.error("新的对象:" + newInstance);
        log.error(hungrySingletonSerializable == newInstance ? "等" : "不等");
    }

}

