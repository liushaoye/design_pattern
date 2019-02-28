package com.google.designpattern.structural.decorator;

import com.google.designpattern.structural.decorator.demoone.base.BatterCake;
import com.google.designpattern.structural.decorator.demoone.son.BatterWithEggs;
import com.google.designpattern.structural.decorator.demoone.son.BatterWithEggsSauage;
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
		log.info(batterCake.getDescription()+" 销售价格: "+batterCake.getCost());

		BatterCake batterWithEggs = new BatterWithEggs();
		log.info(batterWithEggs.getDescription()+" 销售价格: "+batterWithEggs.getCost());

		BatterCake batterWithEggsSauage = new BatterWithEggsSauage();
		log.info(batterWithEggsSauage.getDescription()+" 销售价格: "+batterWithEggsSauage.getCost());

	}

}

