package com.google.designpattern.creatianl.d$abstractfactory.pojo;

import com.google.designpattern.creatianl.d$abstractfactory.base.AbstractArticle;
import lombok.extern.slf4j.Slf4j;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  FeArticle
 * @date : 2019/2/19 0019
 * @time : 11:28
 * @createTime 2019-02-19 11:28
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/
@Slf4j
public class FeArticle extends AbstractArticle{
    @Override
    public void product() {
        log.info("Fe文章构建");
    }
}
