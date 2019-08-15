/*
package com.threadchat3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

*/
/**
 * @program: learn-demo
 * @description:
 * @author: LWB
 * @create: 2019-08-13 09:30
 *//*

public class Res {
    private String name;
    private int count = 1;

    private Lock lock = new ReentrantLock();
    private Condition con = lock.newCondition();

    //定义标记
    private boolean flag;

    //提供了给商品赋值的方法
    public  void set(String name) {

        lock.lock();

       try {
           while (flag) {//判断标记。 true 执行wait()，等待。  false：生产
               try {
                   con.await();
               } catch (Exception e) {
                   System.out.println(e.getMessage());
               }
           }
           this.name = name + "--" + count;
           count++;
           System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);

           flag = true;
           con.signalAll();
       }finally {
          lock.unlock();
       }

    }

    //获取消费者方法
    public  void get() {

        lock.lock();

       try {
           while (!flag) {
               try {
                   con.await();
               } catch (Exception e) {
                   System.out.println(e.getMessage());
               }
           }
           System.out.println(Thread.currentThread().getName() + "......消费者......" + this.name);

           //将标记改为false
           flag = false;
           //唤醒生产者
           con.signalAll();
       }finally {
           lock.unlock();
       }

    }
}
*/




package com.threadchat3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: learn-demo
 * @description:  两个监视器
 * @author: LWB
 * @create: 2019-08-13 09:30
 */
public class Res {
    private String name;
    private int count = 1;

    private Lock lock = new ReentrantLock();
    private Condition p_con = lock.newCondition();//生产者
    private Condition c_con = lock.newCondition();//消费者

    //定义标记
    private boolean flag;

    //提供了给商品赋值的方法
    public  void set(String name) {

        lock.lock();

        try {
            while (flag) {//判断标记。 true 执行wait()，等待。  false：生产
                try {
                    p_con.await();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            this.name = name + "--" + count;
            count++;
            System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);

            flag = true;
            c_con.signal();
        }finally {
            lock.unlock();
        }

    }

    //获取消费者方法
    public  void get() {

        lock.lock();

        try {
            while (!flag) {
                try {
                    c_con.await();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println(Thread.currentThread().getName() + "......消费者......" + this.name);

            //将标记改为false
            flag = false;
            //唤醒生产者
            p_con.signal();
        }finally {
            lock.unlock();
        }

    }
}

