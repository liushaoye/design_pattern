package com.google.designpattern.creatianl.singleton.threadlocal;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  ThreadLocal
 * @date : 2019/2/26 0026
 * @time : 15:23
 * @createTime 2019-02-26 15:23
 * @version : 2.0
 * @description :
 *
 *    不能保证应用全局唯一,但是线程却是唯一
 *    隔离了多个线程对数据访问的冲突
 *    同步锁,时间换空间的方式,因为要排队,threadLocal方式,为空间换时间的方式,会创建多个对象,但是对于这个线程,它是唯一的
 *******************************/

public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance =
            new ThreadLocal<ThreadLocalInstance>() {

                /**
                 * 类的初始化
                 *
                 * @return
                 */
                @Override
                protected ThreadLocalInstance initialValue() {
                    return new ThreadLocalInstance();
                }
            };


    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstance.get();
    }

}
