package com.threadchat2;

/**
 * @program: learn-demo
 * @description: 消费者
 * @author: LWB
 * @create: 2019-08-13 09:31
 **/
public class Producer implements Runnable {

    Res res ;

    public Producer(Res res) {
        this.res = res;
    }

    @Override
    public void run(){
        while (true){
            res.set("面包");
        }
    }
}
