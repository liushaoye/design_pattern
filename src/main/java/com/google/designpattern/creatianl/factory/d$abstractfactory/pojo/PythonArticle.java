package com.google.designpattern.creatianl.factory.d$abstractfactory.pojo;

import com.google.designpattern.creatianl.factory.d$abstractfactory.base.AbstractArticle;
import lombok.extern.slf4j.Slf4j;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  PythonArticle
 * @date : 2019/2/19 0019
 * @time : 11:26
 * @createTime 2019-02-19 11:26
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Slf4j
public class PythonArticle extends AbstractArticle {


    @Override
    public void product() {
        log.info("Python 文章构建");
    }
}
