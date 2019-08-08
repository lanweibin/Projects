package com.reflect;

import com.entity.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @program: learn-demo
 * @description: 创建反射的方式
 * @author: LWB
 * @create: 2019-08-08 16:18
 **/
public class ReflectDemo1 {


    /**
     * 默认使用无参构造函数
     */
    @Test
    public void test(){
        try {
            Class clazz = Class.forName("com.entity.Person");
            Object obj = clazz.newInstance();
            Person person = (Person) clazz.newInstance();

            person.setName("小三");
            person.setAge("15");
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public void test2(){
        try {
            Class clazz = Class.forName("com.entity.Person");
            Constructor con =  clazz.getConstructor(String.class, String.class);

            Object obj = con.newInstance("小白", "29");

            System.out.println(con);
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
