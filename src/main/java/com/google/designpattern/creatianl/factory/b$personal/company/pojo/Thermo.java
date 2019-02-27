package com.google.designpattern.creatianl.factory.b$personal.company.pojo;

import lombok.Data;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  Thermo
 * @date : 2019/2/18 0018
 * @time : 11:39
 * @createTime 2019-02-18 11:39
 * @version : 2.0
 * @description :
 *
 *   赛默飞实体类
 *
 *******************************/

@Data
public class Thermo {

    private String name;

    private String describe;

    public Thermo() {
    }

    public Thermo(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }
}
