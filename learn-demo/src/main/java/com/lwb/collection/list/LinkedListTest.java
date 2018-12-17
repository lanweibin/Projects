package com.lwb.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add("111111111111");
        list.add("2222222222222");
        list.add("333333333333333333");
        list.add("444444444444444");

        list.removeFirst();

        MyQueue myQueue = new MyQueue();
        myQueue.myAdd("111111111");
        myQueue.myAdd("222222222222222");
        myQueue.myAdd("33333333333");
        myQueue.myAdd("4444444444444");

        while (!myQueue.idNull()){
            System.out.println(myQueue.myget());
        }

        method(list);

    }

    public static void method(List list) {

        while (true) {
            System.out.println();
        }
    }

    public static void method2(){
        LinkedList list = new LinkedList();
        list.removeLast();
    }
}

class MyQueue{
    private LinkedList link;

    MyQueue(){
        link = new LinkedList();
    }

    public void myAdd(Object obj){
        link.addFirst(obj);
    }

    public Object myget( ){
       return link.removeLast();
    }

    public boolean idNull(){
        return link.isEmpty();
    }
}
