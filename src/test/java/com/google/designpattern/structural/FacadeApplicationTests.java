package com.google.designpattern.structural;

import com.google.designpattern.structural.facade.demoone.bigservice.GiftExchange;
import com.google.designpattern.structural.facade.demoone.bigservice.GiftExchangeFacade;
import com.google.designpattern.structural.facade.demoone.entity.PointsGift;
import com.google.designpattern.structural.facade.demoone.service.PointPaymentService;
import com.google.designpattern.structural.facade.demoone.service.QualifyService;
import com.google.designpattern.structural.facade.demoone.service.ShippingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeApplicationTests {

    /**
     * 一般模式
     */
    @Test
    public void giftExchange() {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchange giftExchange = new GiftExchange();
        giftExchange.setQualifyService(new QualifyService());
        giftExchange.setPointPaymentService(new PointPaymentService());
        giftExchange.setShippingService(new ShippingService());
        giftExchange.giftExchange(pointsGift);
    }

    /**
     * 外观模式
     */
    @Test
    public void giftExchangeTrue() {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeFacade giftExchange = new GiftExchangeFacade();
        giftExchange.giftExchange(pointsGift);
    }


}

