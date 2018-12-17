package com.lwb.domain;

public class Student implements Comparable {

    private int age;
    private String name;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Object o) {
        Student stu = (Student) o;
        if (this.age > stu.age){
            return 1;
        }
        if (this.age < stu.age){
            return -1;
        }
        return 0;
    }
}
