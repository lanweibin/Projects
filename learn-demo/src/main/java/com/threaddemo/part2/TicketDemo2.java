package com.threaddemo.part2;

public class TicketDemo2 implements Runnable {
    private int tickets = 1000;

    @Override
    public void run() {
        while (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + "------" + tickets--);
        }
    }

    public static void main(String[] args) {
        TicketDemo2 t  = new TicketDemo2();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
