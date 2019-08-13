package com.threadchat2;

/**
 * @program: learn-demo
 * @description: 消费者
 * @author: LWB
 * @create: 2019-08-13 09:32
 **/
public class Consumer implements Runnable {
    Res res;
    public Consumer(Res res){
        this.res = res;
    }

    @Override
    public void run() {
        while (true) {
            res.get();
        }
    }


}
