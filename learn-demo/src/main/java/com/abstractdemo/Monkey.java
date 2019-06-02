package com.abstractdemo;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class Monkey extends Person {

    public Monkey(String name, String age, String money) {
        super(name, age, money);
    }

    @Override
    void work() {
        System.out.println("敲代码");
    }
}
