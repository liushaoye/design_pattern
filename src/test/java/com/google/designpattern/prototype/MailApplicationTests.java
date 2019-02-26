package com.google.designpattern.prototype;

import com.google.designpattern.prototype.pojo.Mail;
import com.google.designpattern.prototype.pojo.MailProtoType;
import com.google.designpattern.prototype.utils.MailProtoTypeUtil;
import com.google.designpattern.prototype.utils.MailUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailApplicationTests {

    /**
     * 一般情况
     */
    @Test
    public void sendMail() {

        Mail mail = new Mail();
        mail.setContexts("初始化模板");
        for (int i = 0; i < 10; i++) {
            mail.setName("姓名" + i);
            mail.setAddress("姓名" + i + "@163.com");
            mail.setContexts("恭喜您,获奖了");
            MailUtil.sendMail(mail);
        }

        MailUtil.saveOriginMailRecord(mail);
    }

    /**
     * 使用clone方法
     */
    @Test
    public void sendMailClone() throws CloneNotSupportedException {

        MailProtoType mailProtoType = new MailProtoType();
        mailProtoType.setContexts("初始化模板");
        for (int i = 0; i < 10; i++) {
            MailProtoType mailProtoTypeTemplata = (MailProtoType) mailProtoType.clone();

            mailProtoTypeTemplata.setName("姓名" + i);
            mailProtoTypeTemplata.setAddress("姓名" + i + "@163.com");
            mailProtoTypeTemplata.setContexts("恭喜您,获奖了");
            MailProtoTypeUtil.sendMail(mailProtoTypeTemplata);
        }

        MailProtoTypeUtil.saveOriginMailRecord(mailProtoType);
    }

}

