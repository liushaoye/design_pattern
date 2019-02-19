package com.google.designpattern.creational.company;

import com.google.designpattern.creatianl.b$personal.company.brand.AbstractThermo;
import com.google.designpattern.creatianl.b$personal.company.factory.AbstractThermoFactory;
import com.google.designpattern.creatianl.b$personal.company.factoryimpl.HplcThermoFactory;
import com.google.designpattern.creatianl.b$personal.company.factoryimpl.IcThermoFactory;
import com.google.designpattern.creatianl.util.JacksonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CompanyFactoryApplicationTests {

    /**
     * 需要每次new的对象不同
     */
    @Test
    public void testCompanyFactory() {

        // 创建工厂
        AbstractThermoFactory abstractThermoFactory1 = new HplcThermoFactory();
        log.info(JacksonUtil.toJsonString(abstractThermoFactory1.addThermo().addThermo()));

        AbstractThermoFactory abstractThermoFactory2 = new IcThermoFactory();
        log.info(JacksonUtil.toJsonString(abstractThermoFactory2.addThermo().addThermo()));

        List<AbstractThermo> abstractThermos = new ArrayList<>();
        abstractThermos.add(abstractThermoFactory1.addThermo());
        abstractThermos.add(abstractThermoFactory2.addThermo());

        abstractThermos.forEach(
                abstractThermo -> {
                    log.info(JacksonUtil.toJsonString(abstractThermo.addThermo()));
                }
        );



    }

}

