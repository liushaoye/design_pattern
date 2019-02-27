package com.google.designpattern.creatianl.factory.util;

/******************************
 * @author : liuyang
 * <p>ProjectName:designpattern  </p>
 * @ClassName :  MagicCase
 * @date : 2019/2/14 0014
 * @time : 16:57
 * @createTime 2019-02-14 16:57
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public enum MagicCase {
    /**
     * java类型
     */
    JAVA_TYPE("java"),
    /**
     * python类型
     */
    PYTHON_TYPE("python");

    private final String type;

    MagicCase(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
