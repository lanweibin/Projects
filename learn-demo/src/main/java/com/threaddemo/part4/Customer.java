package com.threaddemo.part4;

public class Customer implements Runnable {
    private Bank b = new Bank();
    @Override
    public void run() {
        b.add(100);
    }


    public static void main(String[] args) {
       Customer c = new Customer();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
