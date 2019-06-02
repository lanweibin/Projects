package com.threaddemo;

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
        for (int i = 0; i < 10; i++) {
            System.out.println("i---" + this.name + "---" + i);
        }
    }
}
