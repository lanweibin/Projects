package com.threaddemo;

public class TicketDemo extends Thread {
    private int tickets = 100;

    @Override
    public void run() {

        while (tickets > 0) {

            System.out.println(Thread.currentThread().getName() + "------------" + tickets--);
        }
    }


    public static void main(String[] args) {
        TicketDemo t1 = new TicketDemo();
        TicketDemo t2 = new TicketDemo();
        TicketDemo t3 = new TicketDemo();
        TicketDemo t4 = new TicketDemo();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
