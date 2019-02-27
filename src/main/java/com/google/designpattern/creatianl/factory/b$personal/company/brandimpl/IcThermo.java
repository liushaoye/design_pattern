package com.google.designpattern.creatianl.factory.b$personal.company.brandimpl;

import com.google.designpattern.creatianl.factory.b$personal.company.brand.AbstractThermo;
import com.google.designpattern.creatianl.factory.b$personal.company.pojo.Thermo;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  IcThermo
 * @date : 2019/2/18 0018
 * @time : 11:46
 * @createTime 2019-02-18 11:46
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class IcThermo extends AbstractThermo {

    /**
     * 添加离子
     * @return
     */
    @Override
    public Thermo addThermo() {
        return new Thermo("离子","离子赛默飞");
    }
}
