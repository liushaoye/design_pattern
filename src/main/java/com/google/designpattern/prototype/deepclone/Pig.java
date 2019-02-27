package com.google.designpattern.prototype.deepclone;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  Pig
 * @date : 2019/2/27 0027
 * @time : 11:43
 * @createTime 2019-02-27 11:43
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class Pig implements Cloneable {

    /**
     * 姓名
     */
    private String name;

    /**
     * 生日
     */
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    /**
     * 改写深克隆,改写后,二次修改就不会被克隆
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }
}
