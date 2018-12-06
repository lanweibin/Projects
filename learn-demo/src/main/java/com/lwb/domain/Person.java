package com.lwb.domain;

public class Person {

    private String name;
    private int age;

    public Person() {
        super();
        System.out.println("person run");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
