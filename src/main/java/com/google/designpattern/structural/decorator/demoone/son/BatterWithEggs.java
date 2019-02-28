package com.google.designpattern.structural.decorator.demoone.son;

import com.google.designpattern.structural.decorator.demoone.base.BatterCake;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  BatterWithEggs
 * @date : 2019/2/28 0028
 * @time : 17:58
 * @createTime 2019-02-28 17:58
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class BatterWithEggs extends BatterCake {

    /**
     * 重写方法
     *
     * @return
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " 加一个鸡蛋";
    }

    /**
     * 同上
     *
     * @return
     */
    @Override
    public Integer getCost() {
        return super.getCost() + 1;
    }
}
