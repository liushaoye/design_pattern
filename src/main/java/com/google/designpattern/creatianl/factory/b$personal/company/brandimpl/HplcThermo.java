package com.google.designpattern.creatianl.factory.b$personal.company.brandimpl;

import com.google.designpattern.creatianl.factory.b$personal.company.brand.AbstractThermo;
import com.google.designpattern.creatianl.factory.b$personal.company.pojo.Thermo;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  HplcThermo
 * @date : 2019/2/18 0018
 * @time : 11:44
 * @createTime 2019-02-18 11:44
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class HplcThermo extends AbstractThermo {


    /**
     * 添加液相
     *
     * @return
     */
    @Override
    public Thermo addThermo() {
        return new Thermo("液相","液相赛默飞");
    }
}
