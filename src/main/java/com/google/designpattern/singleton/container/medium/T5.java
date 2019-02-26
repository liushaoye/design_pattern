package com.google.designpattern.singleton.container.medium;

import com.google.designpattern.singleton.container.nothreadsafe.ContainerSingleton;
import lombok.extern.slf4j.Slf4j;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  T
 * @date : 2019/2/21 0021
 * @time : 13:27
 * @createTime 2019-02-21 13:27
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Slf4j
public class T5 implements Runnable {

    /**
     * 容器单例模式线程测试
     */
    @Override
    public void run() {
        ContainerConcurrentSingleton.putInstance("object", new Object());
        Object instance = ContainerConcurrentSingleton.getInstance("object");
        log.info(Thread.currentThread().getName() + " " + instance);
    }
}
