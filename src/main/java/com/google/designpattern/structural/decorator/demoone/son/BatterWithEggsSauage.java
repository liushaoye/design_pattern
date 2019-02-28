package com.google.designpattern.structural.decorator.demoone.son;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  BatterWithEggsSauage
 * @date : 2019/2/28 0028
 * @time : 19:31
 * @createTime 2019-02-28 19:31
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class BatterWithEggsSauage extends BatterWithEggs {

    /**
     * 加产品
     *
     * @return
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " 加一根香肠";
    }

    /**
     * 加价
     *
     * @return
     */
    @Override
    public Integer getCost() {
        return super.getCost()+2;
    }
}
