package com.abstractdemo;

public class Cat extends Animal {


    @Override
    void run() {
        System.out.println("hshs");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        Animal animal = new Animal() {
            @Override
            void run() {
                System.out.println("不能用new");
            }
        };
        animal.run();
    }
}
