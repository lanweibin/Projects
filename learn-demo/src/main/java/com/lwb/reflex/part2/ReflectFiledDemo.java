package com.lwb.reflex.part2;

import java.lang.reflect.Field;

public class ReflectFiledDemo {
    public static void main(String[] args)throws Exception {

        getFielDemo();
    }

    private static void getFielDemo() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        String className = "com.lwb.domain.Person";
        Class clazz = Class.forName(className);

        Field field = clazz.getDeclaredField("age");

        Object obj = clazz.newInstance();
        field.setAccessible(true);
        field.set(obj, 30);

        System.out.println(field.get(obj));
    }
}
