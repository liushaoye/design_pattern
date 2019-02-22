package com.google.designpattern.singleton.lazypattern.a$baseversion;

import com.google.designpattern.singleton.lazypattern.b$versiontwo.T2;
import com.google.designpattern.singleton.lazypattern.c$versionthree.T3;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LazySingletonApplicationTests {

    /**
     * 简单启用测试
     */
    @Test
    public void getLazySingletonInstance() {
        LazySingleton lazySingleton = LazySingleton.getLazySingletonInstance();
        log.info("单线程懒加载:" + lazySingleton);
    }


    /**
     * 线程调度的时候
     */
    @Test
    public void getLazySingletonInstanceRun() {

        Thread thread1 = new Thread(new T());
        Thread thread2 = new Thread(new T());

        thread1.start();
        thread2.start();
        log.info("*************结束*************");
    }

    /**
     * 安全线程测试
     */
    @Test
    public void testDoubleSingle(){
        Thread thread1 = new Thread(new T2());
        Thread thread2 = new Thread(new T2());

        thread1.start();
        thread2.start();
        log.info("*************结束*************");
    }

    /**
     * 静态内部
     */
    @Test
    public void testStaticInnerClassSingleton(){
        Thread thread1 = new Thread(new T3());
        Thread thread2 = new Thread(new T3());

        thread1.start();
        thread2.start();
        log.info("*************结束*************");
    }
}

