package com.threaddemo.part3;

/**
 * 验证同步函数锁是this
 */

public class TicketDemo4 implements Runnable {
    private int tickets = 1000;

    boolean flag = true;
    Object obj = new Object();

    @Override
    public void run() {

        if (flag) {
            while (true) {
//                synchronized (obj) {
                synchronized (this) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "===code=====" + tickets--);
                    }
                }
            }
        }else {
            while (true){
                sale();
            }
        }


    }

    public synchronized void sale() {
            if (tickets > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "===fun=====" + tickets--);
            }

    }




   /* public static void main(String[] args) throws InterruptedException {
        TicketDemo4 t = new TicketDemo4();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        Thread.sleep(10);
        t.flag = false;
        t2.start();
    }*/
}
