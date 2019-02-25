package com.google.designpattern.singleton.reflectpattern;

import com.google.designpattern.singleton.lazypattern.c$versionthree.StaticInnerClassSingleton;
import com.google.designpattern.singleton.reflect.LazySingletonReflect;
import com.google.designpattern.singleton.reflect.LazySingletonReflect2;
import com.google.designpattern.singleton.reflect.SingletonReflect;
import com.google.designpattern.singleton.reflect.SingletonReflectStatic;
import com.google.designpattern.singleton.serializable.HungrySingletonSerializable;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ReflectApplicationTests {


    /**
     * 未修改序列化的情况,要注释反射中设置的代码
     */
    @Test
    public void getNoReflect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<SingletonReflect> objectClass = SingletonReflect.class;
        Constructor<SingletonReflect> constructor = objectClass.getDeclaredConstructor();

        SingletonReflect instance = SingletonReflect.getSingletonReflect();

        SingletonReflect newInstance = constructor.newInstance();


        log.error("初始创建:" + instance);
        log.error("新的对象:" + newInstance);
        log.error(instance == newInstance ? "等" : "不等");
    }

    /**
     * 未修改序列化的情况,要注释反射中设置的代码
     */
    @Test
    public void getNoReflect2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<SingletonReflect> objectClass = SingletonReflect.class;
        Constructor<SingletonReflect> constructor = objectClass.getDeclaredConstructor();
        // 权限置为true,就放开了
        constructor.setAccessible(true);
        SingletonReflect instance = SingletonReflect.getSingletonReflect();

        SingletonReflect newInstance = constructor.newInstance();


        log.error("初始创建:" + instance);
        log.error("新的对象:" + newInstance);
        log.error(instance == newInstance ? "等" : "不等");
    }


    /**
     * 修改序列化后的情况,也可用static的模式
     */
    @Test
    public void getReflect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<SingletonReflect> objectClass2 = SingletonReflect.class;

        Class<StaticInnerClassSingleton> objectClass = StaticInnerClassSingleton.class;

        Constructor<SingletonReflect> constructor = objectClass2.getDeclaredConstructor();
        // 权限置为true,就放开了
        constructor.setAccessible(true);

        //修改
        SingletonReflect instance = SingletonReflect.getSingletonReflect();

        SingletonReflect newInstance = constructor.newInstance();

        log.error("初始创建:" + instance);
        log.error("新的对象:" + newInstance);
        log.error(instance == newInstance ? "等" : "不等");
    }


    /**
     * 加上防止单例的RuntimeException才会有效
     *
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    @Test
    public void getNoReflectStatic() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<StaticInnerClassSingleton> objectClass = StaticInnerClassSingleton.class;

        Constructor<StaticInnerClassSingleton> constructor = objectClass.getDeclaredConstructor();
        // 权限置为true,就放开了
        constructor.setAccessible(true);

        //修改
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

        StaticInnerClassSingleton newInstance = constructor.newInstance();

        log.error("初始创建:" + instance);
        log.error("新的对象:" + newInstance);
        log.error(instance == newInstance ? "等" : "不等");

    }


    /**
     * 加了之后
     *
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    @Test
    public void getReflectStatic() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<SingletonReflectStatic> objectClass = SingletonReflectStatic.class;

        Constructor<SingletonReflectStatic> constructor = objectClass.getDeclaredConstructor();
        // 权限置为true,就放开了
        constructor.setAccessible(true);

        //修改
        SingletonReflectStatic instance = SingletonReflectStatic.getHungrySingletonStaticInstance();

        SingletonReflectStatic newInstance = constructor.newInstance();

        log.error("初始创建:" + instance);
        log.error("新的对象:" + newInstance);
        log.error(instance == newInstance ? "等" : "不等");

    }


    /**
     * 非懒汉式
     *
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    @Test
    public void getLazyReflectStatic() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = LazySingletonReflect.class;

        Constructor constructor = objectClass.getDeclaredConstructor();
        // 权限置为true,就放开了
        constructor.setAccessible(true);

        //修改
        LazySingletonReflect instance = LazySingletonReflect.getLazySingletonInstance();

        LazySingletonReflect newInstance = (LazySingletonReflect) constructor.newInstance();

        log.error("初始创建:" + instance);
        log.error("新的对象:" + newInstance);
        log.error(instance == newInstance ? "等" : "不等");

    }

    /**
     * 顺序修改,Lazy的反射是无法避免的
     *
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    @Test
    public void getLazyReflectStaticFluence() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = LazySingletonReflect.class;

        Constructor constructor = objectClass.getDeclaredConstructor();
        // 权限置为true,就放开了
        constructor.setAccessible(true);

        //修改
        LazySingletonReflect newInstance = (LazySingletonReflect) constructor.newInstance();

        LazySingletonReflect instance = LazySingletonReflect.getLazySingletonInstance();


        log.error("初始创建:" + instance);
        log.error("新的对象:" + newInstance);
        log.error(instance == newInstance ? "等" : "不等");

    }

    /**
     * 反射攻击
     *
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    @Test
    public void getLazyReflectStatic2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = LazySingletonReflect2.class;

        Constructor constructor = objectClass.getDeclaredConstructor();
        // 权限置为true,就放开了
        constructor.setAccessible(true);

        //修改
        LazySingletonReflect2 newInstance = (LazySingletonReflect2) constructor.newInstance();

        LazySingletonReflect2 instance = LazySingletonReflect2.getLazySingletonInstance();


        log.error("初始创建:" + instance);
        log.error("新的对象:" + newInstance);
        log.error(instance == newInstance ? "等" : "不等");

    }

}

