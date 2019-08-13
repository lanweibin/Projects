package com.threadchat2;

/**
 * @program: learn-demo
 * @description:
 * @author: LWB
 * @create: 2019-08-13 09:25
 **/


/***
 * 多线程间的通信，多个线程在处理同一个资源。但是处理的任务不一样
 * 生产者，消费者
 */
public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        //1 穿件资源
        Res r = new Res();
        Producer pro = new Producer(r);
        Consumer con = new Consumer(r);

        //创建线程
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(con);

        t1.start();
        t2.start();

    }
}
