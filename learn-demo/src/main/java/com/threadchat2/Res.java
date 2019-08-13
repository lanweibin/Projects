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

    //定义标记
    private boolean flag;

    //提供了给商品赋值的方法
    public synchronized void set(String name) {

        while (flag) {//判断标记。 true 执行wait()，等待。  false：生产
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        this.name = name + "--" + count;
        count++;
        System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);

        flag = true;
        notifyAll();


    }

    //获取消费者方法
    public synchronized void get() {
        while (!flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(Thread.currentThread().getName() + "......消费者......" + this.name);

        //将标记改为false
        flag = false;
        //唤醒生产者
        notifyAll();

    }
}
