package com.google.designpattern.creatianl.singleton.contain;

import com.google.designpattern.creatianl.singleton.container.medium.T5;
import com.google.designpattern.creatianl.singleton.container.nothreadsafe.T4;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ContainerPatternApplicationTests {


    /**
     * 多线程测试容器单例模式
     */
    @Test
    public void containerLoads() {

        Thread thread1 = new Thread(new T4());
        Thread thread2 = new Thread(new T4());

        thread1.start();
        thread2.start();
        log.info("*************结束*************");

    }

    /**
     * 折中的线程安全方式Concurrent
     */
    @Test
    public void containerConcurrentLoads() {

        Thread thread1 = new Thread(new T5());
        Thread thread2 = new Thread(new T5());

        thread1.start();
        thread2.start();
        log.info("*************结束*************");

    }

}

