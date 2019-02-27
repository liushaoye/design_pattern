package com.google.designpattern.structural.facade.demoone.entity;

import lombok.Data;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  PointsGift
 * @date : 2019/2/27 0027
 * @time : 17:15
 * @createTime 2019-02-27 17:15
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Data
public class PointsGift {

    /**
     * 礼物名称
     */
    private String name;

    public PointsGift(String name) {
        this.name = name;
    }
}
