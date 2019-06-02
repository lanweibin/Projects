package com.threaddemo.part2;

public class TicketTest {

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
