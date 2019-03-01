package com.google.designpattern.structural.decorator.demotwo.entity;

import com.google.designpattern.structural.decorator.demotwo.base.AbstractBatterCake;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  DecoratorImpl
 * @date : 2019/3/1 0001
 * @time : 14:18
 * @createTime 2019-03-01 14:18
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class DecoratorImpl extends AbstractBatterCake {

    private AbstractBatterCake abstractBatterCake;

    public DecoratorImpl(AbstractBatterCake abstractBatterCake) {
        this.abstractBatterCake = abstractBatterCake;
    }

    /**
     * 委托给父类执行
     *
     * @return
     */
    @Override
    public String getDescription() {
        return this.abstractBatterCake.getDescription();
    }

    @Override
    public Integer getCost() {
        return this.abstractBatterCake.getCost();
    }
}
