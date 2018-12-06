package com.lwb.reflex.part1;

import com.lwb.domain.Person;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        methodDemo_3();
    }

    private static void methodDemo_3() throws ClassNotFoundException {
        String clazzName = "com.lwb.domain.Person" ;
        Class clazz = Class.forName(clazzName);

        System.out.println(clazz);
    }

    private static void methodDemo_2() {
        Class clazz = Person.class;
        Class clazz2 = Person.class;
        System.out.println(clazz == clazz2);
    }

    public static void methodDemo_1() {
        Person p1 = new Person();
        Class clazz1 = p1.getClass();

        Person p2 = new Person();
        Class clazz2 = p2.getClass();
        System.out.println(clazz1 == clazz2);
    }
}
