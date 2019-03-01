package com.google.designpattern.structural.decorator.demotwo.impl;

import com.google.designpattern.structural.decorator.demotwo.base.AbstractBatterCake;
import com.google.designpattern.structural.decorator.demotwo.entity.DecoratorImpl;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  EggDecorator
 * @date : 2019/3/1 0001
 * @time : 14:28
 * @createTime 2019-03-01 14:28
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class EggDecorator extends DecoratorImpl {


    public EggDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "  加一个鸡蛋";
    }

    @Override
    public Integer getCost() {
        return super.getCost() + 1;
    }
}
