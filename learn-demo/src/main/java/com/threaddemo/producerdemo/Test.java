package com.threaddemo.producerdemo;

class Res {
    private String name;
    private int count;

    public synchronized void set(String name){
        this.name = name + "--" + count;
        count++;
        System.out.println(Thread.currentThread().getName() + "...生产者..." + count);
    }

    public synchronized void get(){
        System.out.println(Thread.currentThread().getName() + "......消费者..." + count);
    }
}


//生产者
 class Producer implements Runnable{
    Res res;

    public Producer(Res res) {
        this.res = res;
    }

    @Override
     public void run() {
        while (true){
            res.set("面包");
        }
     }

}

 //消费者
 class Customer implements Runnable{
    Res res;

     public Customer(Res res) {
         this.res = res;
     }

     @Override
     public void run() {
       while (true){
           res.get();
       }
     }
 }

public class Test {
    public static void main(String[] args) {
        Res res = new Res();

        Producer producer = new Producer(res);
        Customer customer = new Customer(res);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(customer);

        t1.start();
        t2.start();
    }
}
