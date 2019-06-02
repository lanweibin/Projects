package com.threaddemo.part5deadlock;

public class Task implements Runnable {
    private boolean flag;



    Task(boolean b) {
        this.flag = b;
    }

    @Override
    public void run() {
        if (flag) {
//            while (true)
            synchronized (MyLock.MY_LOCKA) {
                    System.out.println("if-------------------mylocka");
                synchronized (MyLock.MY_LOCKB) {
                    System.out.println("if-------------------mylockb");
                }
            }
        } else {
//            while (true)
            synchronized (MyLock.MY_LOCKB) {
                  System.out.println("else-------------------mylockb");
                synchronized (MyLock.MY_LOCKA) {
                    System.out.println( "else-------------------mylocka");
                }
            }
        }

    }
}
