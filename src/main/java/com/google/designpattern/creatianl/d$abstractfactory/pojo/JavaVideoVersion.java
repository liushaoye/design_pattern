package com.google.designpattern.creatianl.d$abstractfactory.pojo;

import com.google.designpattern.creatianl.d$abstractfactory.base.AbstractVideoVersion;

/******************************
 * @author : liuyang
 * <p>ProjectName:designpattern  </p>
 * @ClassName :  JavaVideoVersion
 * @date : 2019/2/14 0014
 * @time : 16:34
 * @createTime 2019-02-14 16:34
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class JavaVideoVersion extends AbstractVideoVersion {

    @Override
    public void product() {
        System.out.println("Java视频播放");
    }
}
