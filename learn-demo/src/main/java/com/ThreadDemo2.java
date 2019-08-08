package com;

import org.junit.Test;

public class ThreadDemo2 extends Thread {
    @Override
    public void run(){
        System.out.println("haah");
    }

    @Test
    public void test(){
        ThreadDemo2 tt = new ThreadDemo2();
        tt.start();
        tt.run();
    }
}
