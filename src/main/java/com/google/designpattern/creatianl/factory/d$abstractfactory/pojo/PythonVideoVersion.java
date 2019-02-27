package com.google.designpattern.creatianl.factory.d$abstractfactory.pojo;

import com.google.designpattern.creatianl.factory.d$abstractfactory.base.AbstractVideoVersion;

/******************************
 * @author : liuyang
 * <p>ProjectName:designpattern  </p>
 * @ClassName :  PythonVideoVersion
 * @date : 2019/2/14 0014
 * @time : 16:37
 * @createTime 2019-02-14 16:37
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class PythonVideoVersion extends AbstractVideoVersion {

    @Override
    public void product() {
        System.out.println("Python视频播放");
    }
}
