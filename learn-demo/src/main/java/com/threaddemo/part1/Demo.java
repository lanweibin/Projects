package com.threaddemo.part1;

public class Demo extends Thread {
    private String name;

    @Override
    public void run() {
        show();
    }

    public Demo(String name) {
        this.name = name;
    }

    void show(){
        for (int i = 0; i < 40; i++) {
            System.out.println(Thread.currentThread().getName() +"----"+ name+"---" + i);
        }
    }

    @Override
    public synchronized void start() {
        run();
    }
}
