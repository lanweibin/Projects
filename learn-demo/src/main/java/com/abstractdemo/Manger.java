package com.abstractdemo;

import org.junit.Test;

public class Manger extends Person {
    public String bonus;

    public Manger(String name, String age, String money, String bonus) {
        super(name, age, money);
        this.bonus = bonus;
    }

    @Override
    void work() {
        System.out.println("搞项目");
    }


    public static void main(String[] args) {
        Monkey m = new Monkey("程序员", "15","1000");
        Manger manger = new Manger("经理", "30", "3000", "1000");


        System.out.println( m.name +m.age + m.money);
        m.work();
    }
}
