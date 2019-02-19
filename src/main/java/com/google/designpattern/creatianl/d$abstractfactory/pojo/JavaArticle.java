package com.google.designpattern.creatianl.d$abstractfactory.pojo;

import com.google.designpattern.creatianl.d$abstractfactory.base.AbstractArticle;
import lombok.extern.slf4j.Slf4j;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  JavaArticle
 * @date : 2019/2/19 0019
 * @time : 11:25
 * @createTime 2019-02-19 11:25
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Slf4j
public class JavaArticle extends AbstractArticle {

    @Override
    public void product() {
        log.info("Java 文章构建");
    }
}
