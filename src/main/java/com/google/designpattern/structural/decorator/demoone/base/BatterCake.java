package com.google.designpattern.structural.decorator.demoone.base;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  BatterCake
 * @date : 2019/2/28 0028
 * @time : 17:52
 * @createTime 2019-02-28 17:52
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class BatterCake {

    /***
     * 描述
     * @return
     */
    public String getDescription() {
        return "煎饼";
    }

    /**
     * 付费
     *
     * @return
     */
    public Integer getCost() {
        return 8;
    }

}
