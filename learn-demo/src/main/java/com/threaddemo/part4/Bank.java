package com.threaddemo.part4;

public class Bank {
    private int sum;
    private Object obj = new Object();
    public void add(int n){
        for (int i = 0; i < 3; i++) {

            synchronized (obj) {
                sum = sum + n;
                System.out.println("sum==============" + sum);
            }
        }
    }
}
