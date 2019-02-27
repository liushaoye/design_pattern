package com.google.designpattern.creatianl.factory.b$personal.company.factoryimpl;

import com.google.designpattern.creatianl.factory.b$personal.company.brand.AbstractThermo;
import com.google.designpattern.creatianl.factory.b$personal.company.brandimpl.HplcThermo;
import com.google.designpattern.creatianl.factory.b$personal.company.factory.AbstractThermoFactory;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  HplcThermoFactory
 * @date : 2019/2/18 0018
 * @time : 11:52
 * @createTime 2019-02-18 11:52
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class HplcThermoFactory extends AbstractThermoFactory {

    @Override
    public AbstractThermo addThermo() {
        return new HplcThermo();
    }
}
