package com.google.designpattern.structural.facade.demoone.bigservice;

import com.google.designpattern.structural.facade.demoone.entity.PointsGift;
import com.google.designpattern.structural.facade.demoone.service.PointPaymentService;
import com.google.designpattern.structural.facade.demoone.service.QualifyService;
import com.google.designpattern.structural.facade.demoone.service.ShippingService;
import lombok.experimental.var;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.util.HashMap;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  GiftExchange
 * @date : 2019/2/27 0027
 * @time : 17:46
 * @createTime 2019-02-27 17:46
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Slf4j
public class GiftExchange {


    private QualifyService qualifyService;

    private PointPaymentService pointPaymentService;

    private ShippingService shippingService;

    /**
     * 处理礼物信息
     *
     * @param pointsGift
     */
    public void giftExchange(PointsGift pointsGift) {

        if (qualifyService.isAvailable(pointsGift)) {
            // 资格效验通过
            if (pointPaymentService.isPayed(pointsGift)) {
                // 支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                log.info("物流系统下单成功,订单号是:" + shippingOrderNo);
            }
        }
    }

    public QualifyService getQualifyService() {
        return qualifyService;
    }

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public PointPaymentService getPointPaymentService() {
        return pointPaymentService;
    }

    public void setPointPaymentService(PointPaymentService pointPaymentService) {
        this.pointPaymentService = pointPaymentService;
    }

    public ShippingService getShippingService() {
        return shippingService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }
}
