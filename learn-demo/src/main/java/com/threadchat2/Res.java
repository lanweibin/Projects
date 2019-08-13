package com.threadchat2;

/**
 * @program: learn-demo
 * @description:
 * @author: LWB
 * @create: 2019-08-13 09:30
 */
public class Res {
    private String name;
    private int count = 1;

    //提供了给商品赋值的方法
    public synchronized void set(String name){
        this.name = name + "--" + count;

        count++;

        System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name);
    }

    //获取消费者方法
    public synchronized void get(){
        System.out.println(Thread.currentThread().getName()+"......消费者......"+this.name);
    }
}
