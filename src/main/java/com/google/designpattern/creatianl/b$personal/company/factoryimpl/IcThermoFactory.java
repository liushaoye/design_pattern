package com.google.designpattern.creatianl.b$personal.company.factoryimpl;

import com.google.designpattern.creatianl.b$personal.company.brand.AbstractThermo;
import com.google.designpattern.creatianl.b$personal.company.brandimpl.IcThermo;
import com.google.designpattern.creatianl.b$personal.company.factory.AbstractThermoFactory;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  IcThermoFactory
 * @date : 2019/2/18 0018
 * @time : 11:55
 * @createTime 2019-02-18 11:55
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class IcThermoFactory extends AbstractThermoFactory {

    @Override
    public AbstractThermo addThermo() {
        return new IcThermo();
    }
}
