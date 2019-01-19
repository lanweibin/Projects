package com.lwb.collection.list;

import com.lwb.entity.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student("111", "11"));
        list.add(new Student("222", "22"));
        list.add(new Student("333", "33"));
        list.add(new Student("444", "44"));

//        method1(list);
        method2(list);

    }

    private static void method2(List<Student> list) {
        System.out.println("迭代器遍历");
        Iterator it = list.iterator();
        while (it.hasNext()){
            Student stu = (Student) it.next();

            System.out.println(stu.getName()+"----------"+ stu.getAge());
        }
    }


    private static void method1(List<Student> list) {
        System.out.println("增强for遍历");
        for (Student lists : list){
            System.out.println(lists.getName() + "--------" +lists.getAge());
        }
    }
}
