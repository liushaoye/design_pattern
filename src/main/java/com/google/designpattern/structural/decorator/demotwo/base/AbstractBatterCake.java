package com.google.designpattern.structural.decorator.demotwo.base;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  AbstractBatterCake
 * @date : 2019/3/1 0001
 * @time : 14:02
 * @createTime 2019-03-01 14:02
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public abstract class AbstractBatterCake {

    /**
     * 描述
     *
     * @return
     */
    public abstract String getDescription();

    /**
     * 支付
     *
     * @return
     */
    public abstract Integer getCost();
}
