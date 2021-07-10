package com.reflect;

import com.entity.Person;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: learn-demo
 * @description:  反射方法
 * @author: LWB
 * @create: 2019-08-08 21:10
 **/
public class ReflectDemo3 {

    public static void main(String[] args) throws Exception {
//        show();

        //静态方法反射
//        staticShow();

        //非静态有参数
        paramShow();
    }

    /**
     * 非静态有参数
     */
    private static void paramShow() throws Exception {
        Class clazz = Class.forName("com.entity.Person");

        Object o = clazz.newInstance();
        Method method = clazz.getMethod("paramShow", String.class, int.class);

        method.invoke(o, "老鼠哥", 19);

    }

    /**
     * 静态无参
     */
    private static void staticShow() throws Exception {
        Class clazz = Class.forName("com.entity.Person");

        Method show = clazz.getMethod("statciShow", null);

        show.invoke(null, null);
    }


    /**
     * 非静态无参
     */

    public static void show() throws Exception{
        Class clazz = Class.forName("com.entity.Person");
        Object obj = clazz.newInstance();
        Method method = clazz.getMethod("show");
        method.invoke(obj, null);
    }




}
