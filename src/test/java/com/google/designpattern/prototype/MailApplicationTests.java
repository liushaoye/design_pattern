package com.google.designpattern.prototype;

import com.google.designpattern.prototype.deepclone.Pig;
import com.google.designpattern.prototype.impl.Son;
import com.google.designpattern.prototype.pojo.Mail;
import com.google.designpattern.prototype.pojo.MailProtoType;
import com.google.designpattern.prototype.serilazable.HungrySingletonProtoType;
import com.google.designpattern.prototype.utils.MailProtoTypeUtil;
import com.google.designpattern.prototype.utils.MailUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Date;

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

    /**
     * 浅克隆的实现
     */
    @Test
    public void sendImpl() throws CloneNotSupportedException {
        Son son = new Son();
        // 不同包,所以不能采用protected
        son.clone();
    }


    /**
     * 深克隆
     */
    @Test
    public void sendDeep() throws CloneNotSupportedException {
        Pig pig1 = new Pig("佩奇", new Date(0L));

        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        pig1.getBirthday().setTime(666666666666L);
        pig1.setName("乔治");
        System.out.println(pig1);
        System.out.println(pig2);
    }


    /**
     * 修复后的clone破坏单例模式
     *
     * @throws CloneNotSupportedException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    @Test
    public void serializableTest() throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        HungrySingletonProtoType hungrySingletonProtoType = HungrySingletonProtoType.getHungrySingletonInstance();
        Method method = hungrySingletonProtoType.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingletonProtoType cloneHungrySingleton = (HungrySingletonProtoType) method.invoke(hungrySingletonProtoType);
        System.out.println(hungrySingletonProtoType);
        System.out.println(cloneHungrySingleton);

    }

}

