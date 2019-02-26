package com.google.designpattern.prototype.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  MailProroType
 * @date : 2019/2/26 0026
 * @time : 19:57
 * @createTime 2019-02-26 19:57
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Slf4j
@Data
public class MailProtoType implements Cloneable {


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

    public MailProtoType() {

        log.info("Mail Constructor");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        log.info("Clone Mail Object ");

        return super.clone();
    }
}
