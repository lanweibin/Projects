package com.reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @program: learn-demo
 * @description:  反射demo2
 * @author: LWB
 * @create: 2019-08-08 17:33
 **/
public class ReflectDemo2 {

    @Test
    public void test1() throws Exception {
        Class clazz = Class.forName("com.entity.Person");

        Object obj = clazz.newInstance();
//        Field field = clazz.getField("age");//只能获取公共的
        Field field = clazz.getDeclaredField("age");

        field.setAccessible(true);
        field.set(obj, "10");

        System.out.println(obj);
    }
}
