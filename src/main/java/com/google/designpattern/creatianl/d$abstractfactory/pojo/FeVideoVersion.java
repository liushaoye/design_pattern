package com.google.designpattern.creatianl.d$abstractfactory.pojo;

import com.google.designpattern.creatianl.d$abstractfactory.base.AbstractVideoVersion;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  FeVideoVersion
 * @date : 2019/2/18 0018
 * @time : 11:13
 * @createTime 2019-02-18 11:13
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class FeVideoVersion extends AbstractVideoVersion {

    @Override
    public void product() {
        System.out.println("Fe视频播放");
    }
}
