package com.entity;

/**
 * @program: learn-demo
 * @description: 人实体
 * @author: LWB
 * @create: 2019-08-08 16:19
 **/
public class Person {
    private String name;
    private String age;

    private Integer  voteNum;

    public Person() {
    }


    public Integer getVoteNum() {
        return voteNum;
    }

    public void setVoteNum(Integer voteNum) {
        this.voteNum = voteNum;
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    public void show(){
        System.out.println("无参方法");
    }

    public static void statciShow(){
        System.out.println("静态无参方法");
    }


    public static void paramShow(String name, int age){
        System.out.println("有参方法"+ name +  "----------" +age);
    }

}
