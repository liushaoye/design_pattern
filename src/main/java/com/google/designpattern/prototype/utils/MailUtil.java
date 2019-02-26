package com.google.designpattern.prototype.utils;

import com.google.designpattern.prototype.pojo.Mail;
import lombok.extern.slf4j.Slf4j;

import java.text.MessageFormat;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  MailUtil
 * @date : 2019/2/26 0026
 * @time : 17:59
 * @createTime 2019-02-26 17:59
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Slf4j
public class MailUtil {

    /**
     * 发送的内容
     *
     * @param mail 邮件实体类
     */
    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学,邮件地址:{1},邮件内容:{2}发送邮件成功";
        log.info("邮件内容:" + MessageFormat.format(outputContent, mail.getName(), mail.getAddress(), mail.getContexts()));
    }

    /**
     * 保存邮件记录
     *
     * @param mail 邮件实体类
     */
    public static void saveOriginMailRecord(Mail mail) {
        log.info("存储originMail记录,originMail:" + mail.getContexts());
    }


}
