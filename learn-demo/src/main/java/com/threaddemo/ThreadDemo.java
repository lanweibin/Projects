package com.threaddemo;

public class ThreadDemo {

    public static void main(String[] args) {
        Demo d1 = new Demo("张三");
        Demo d2 = new Demo("李四");

        d1.start();
        d2.start();
    }
}
