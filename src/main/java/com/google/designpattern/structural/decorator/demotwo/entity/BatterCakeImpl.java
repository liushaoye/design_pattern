package com.google.designpattern.structural.decorator.demotwo.entity;

import com.google.designpattern.structural.decorator.demotwo.base.AbstractBatterCake;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  BatterCakeImpl
 * @date : 2019/3/1 0001
 * @time : 14:05
 * @createTime 2019-03-01 14:05
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/
public class BatterCakeImpl extends AbstractBatterCake {

    /**
     * 描述
     *
     * @return
     */
    @Override
    public String getDescription() {
        return "煎饼 ";
    }

    /**
     * 支付
     *
     * @return
     */
    @Override
    public Integer getCost() {
        return 8;
    }
}
