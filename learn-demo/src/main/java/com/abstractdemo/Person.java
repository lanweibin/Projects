package com.abstractdemo;

public abstract class Person {

    public String name;
    public String age;
    public String money;

    public Person(String name, String age, String money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    abstract void work();
}
