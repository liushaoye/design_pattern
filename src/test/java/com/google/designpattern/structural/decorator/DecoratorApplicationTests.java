package com.google.designpattern.structural.decorator;

import com.google.designpattern.structural.decorator.demoone.base.BatterCake;
import com.google.designpattern.structural.decorator.demoone.son.BatterWithEggs;
import com.google.designpattern.structural.decorator.demoone.son.BatterWithEggsSauage;
import com.google.designpattern.structural.decorator.demotwo.base.AbstractBatterCake;
import com.google.designpattern.structural.decorator.demotwo.entity.BatterCakeImpl;
import com.google.designpattern.structural.decorator.demotwo.impl.EggDecorator;
import com.google.designpattern.structural.decorator.demotwo.impl.SauageDecorator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DecoratorApplicationTests {

    @Test
    public void testDecorator() {

        BatterCake batterCake = new BatterCake();
        log.info(batterCake.getDescription() + " 销售价格: " + batterCake.getCost());

        BatterCake batterWithEggs = new BatterWithEggs();
        log.info(batterWithEggs.getDescription() + " 销售价格: " + batterWithEggs.getCost());

        BatterCake batterWithEggsSage = new BatterWithEggsSauage();
        log.info(batterWithEggsSage.getDescription() + " 销售价格: " + batterWithEggsSage.getCost());

    }

    /**
     * 装饰者模式测试
     */
    @Test
    public void testDecoratorCost() {

        AbstractBatterCake abstractBatterCake;
        abstractBatterCake = new BatterCakeImpl();
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        abstractBatterCake = new SauageDecorator(abstractBatterCake);
        log.info(abstractBatterCake.getDescription() + " 销售价格: " + abstractBatterCake.getCost());

    }

}

