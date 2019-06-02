package com.threaddemo.part5deadlock;

/**
 * 验证同步函数锁是this
 */

public class DeadLock implements Runnable {
    private int tickets = 100;

    boolean flag = true;
    Object obj = new Object();

    @Override
    public void run() {
        if (flag) {
            while (true) {
                synchronized (obj) {
                   sale();
                }
            }
        }else {
            while (true){
                sale();
            }
        }


    }

    public synchronized void sale() {
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "===fun=====" + tickets--);
                }
            }
    }




    public static void main(String[] args) throws InterruptedException {
        DeadLock t = new DeadLock();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        Thread.sleep(10);
        t.flag = false;
        t2.start();
    }
}
