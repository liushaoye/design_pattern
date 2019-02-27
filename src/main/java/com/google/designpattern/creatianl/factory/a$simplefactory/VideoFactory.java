package com.google.designpattern.creatianl.factory.a$simplefactory;

import com.google.designpattern.creatianl.factory.b$formal.AbstractVideo;
import com.google.designpattern.creatianl.factory.b$formal.JavaVideo;
import com.google.designpattern.creatianl.factory.b$formal.PythonVideo;
import com.google.designpattern.creatianl.factory.util.MagicCase;

/******************************
 * @author : liuyang
 * <p>ProjectName:designpattern  </p>
 * @ClassName :  VideoFactory
 * @date : 2019/2/14 0014
 * @time : 16:53
 * @createTime 2019-02-14 16:53
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class VideoFactory {

    /**
     * 简单工厂获取对象值
     *
     * @param type
     * @return
     */
    public AbstractVideo getVideo(String type) {

        if (MagicCase.JAVA_TYPE.getType().equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if (MagicCase.PYTHON_TYPE.getType().equalsIgnoreCase(type)) {
            return new PythonVideo();
        }

        return null;
    }

    /**
     * 反射模式
     * @param c
     * @return
     */
    public AbstractVideo getVideoFlex(Class c) {

        AbstractVideo abstractVideo = null;

        try {
            abstractVideo = (AbstractVideo) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return abstractVideo;
    }
}
