package com.google.designpattern.structural.decorator.demotwo.impl;

import com.google.designpattern.structural.decorator.demotwo.base.AbstractBatterCake;
import com.google.designpattern.structural.decorator.demotwo.entity.DecoratorImpl;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  SauageDecorator
 * @date : 2019/3/1 0001
 * @time : 14:31
 * @createTime 2019-03-01 14:31
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class SauageDecorator extends DecoratorImpl {

    public SauageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "  加一根香肠";
    }

    @Override
    public Integer getCost() {
        return super.getCost() + 2;
    }
}
