package com.google.designpattern.creatianl.singleton.threadlocal;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ThreadLocalApplicationTests {


    /**
     * 多线程测试容threadLocal单例模式
     */
    @Test
    public void threadLocal() {

        Thread thread1 = new Thread(new T6());
        Thread thread2 = new Thread(new T6());

        thread1.start();
        thread2.start();
        log.info("*************结束*************");

    }


}

