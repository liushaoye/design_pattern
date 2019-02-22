package com.google.designpattern.singleton.c$versionthree;

import com.google.designpattern.singleton.b$versiontwo.LazyDoubleCheckSingleton;
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
public class T3 implements Runnable {

    @Override
    public void run() {
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        log.info(Thread.currentThread().getName() + " " + staticInnerClassSingleton);
    }
}