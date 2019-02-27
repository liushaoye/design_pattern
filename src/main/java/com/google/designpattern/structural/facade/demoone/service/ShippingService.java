package com.google.designpattern.structural.facade.demoone.service;

import com.google.designpattern.structural.facade.demoone.entity.PointsGift;
import lombok.extern.slf4j.Slf4j;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  ShippingService
 * @date : 2019/2/27 0027
 * @time : 17:27
 * @createTime 2019-02-27 17:27
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Slf4j
public class ShippingService {

    /**
     * 礼物发送
     * @param pointsGift
     * @return
     */
    public String shipGift(PointsGift pointsGift) {

        //物流系统的对接逻辑
        log.info(pointsGift.getName()+"进入物流系统");

        String shippingOrderNo = "666";

        return shippingOrderNo;
    }
}
