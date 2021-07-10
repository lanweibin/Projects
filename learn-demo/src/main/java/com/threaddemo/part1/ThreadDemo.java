package com.threaddemo.part1;

import com.threaddemo.part1.Demo;

public class ThreadDemo {

    public static void main(String[] args) {
        Demo d1 = new Demo("张三");
        Demo d2 = new Demo("李四");

        d1.start();
        d2.start();

        //for (int i = 0; i < 40; i++) {
        //    System.out.println(Thread.currentThread().getName()+"-------"+ i);
        //
        //}
    }
}
