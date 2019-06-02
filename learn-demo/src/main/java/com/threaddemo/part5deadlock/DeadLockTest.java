package com.threaddemo.part5deadlock;

public class DeadLockTest {

    public static void main(String[] args) {
        Task task1 = new Task(true);
        Task task2 = new Task(false);

        new Thread(task1).start();
        new Thread(task2).start();
    }
}
