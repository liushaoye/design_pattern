package com.google.designpattern.singleton.enumpattern.demoone;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  EnumSingleton
 * @date : 2019/2/25 0025
 * @time : 16:56
 * @createTime 2019-02-25 16:56
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public enum EnumSingleton {

    /**
     *
     */
    INSTANCE;

    /**
     *
     */
    private Object data;


    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
