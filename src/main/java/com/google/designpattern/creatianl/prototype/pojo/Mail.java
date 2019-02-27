package com.google.designpattern.creatianl.prototype.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  Mail
 * @date : 2019/2/26 0026
 * @time : 17:54
 * @createTime 2019-02-26 17:54
 * @version : 2.0
 * @description :
 *
 *    邮件实体了类
 *
 *******************************/

@Slf4j
@Data
public class Mail {

    /**
     * 名称
     */
    private String name;

    /**
     * 地址
     */
    private String address;

    /**
     * 内容
     */
    private String contexts;

    public Mail() {

        log.info("Mail Constructor");
    }
}
