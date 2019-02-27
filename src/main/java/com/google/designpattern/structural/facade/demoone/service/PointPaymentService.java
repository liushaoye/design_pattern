package com.google.designpattern.structural.facade.demoone.service;

import com.google.designpattern.structural.facade.demoone.entity.PointsGift;
import lombok.extern.slf4j.Slf4j;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  PointPaymentService
 * @date : 2019/2/27 0027
 * @time : 17:25
 * @createTime 2019-02-27 17:25
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Slf4j
public class PointPaymentService {

    /**
     * 支付积分
     *
     * @param pointsGift
     * @return
     */
    public boolean isPayed(PointsGift pointsGift) {

        //扣除积分
        log.info("支付" + pointsGift.getName() + " 积分成功");

        return true;
    }
}
