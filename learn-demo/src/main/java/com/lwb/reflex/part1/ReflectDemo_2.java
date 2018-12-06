package com.lwb.reflex.part1;

import java.lang.reflect.Constructor;

public class ReflectDemo_2 {

    public static void main(String[] args) throws Exception {
//        getObject();
        getObject2();
    }

    private static void getObject2() throws Exception {
        String className = "com.lwb.domain.Person";
        Class clazz = Class.forName(className);

        Constructor cons = clazz.getConstructor(String.class, int.class);
//        System.out.println(cons);
        cons.newInstance("1123", 12);
    }

    private static void getObject() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "com.lwb.domain.Person";
        Class clazz = Class.forName(className);

        Object obj = clazz.newInstance();


    }
}
