package com.lwb.collection.set.treeset;

import com.lwb.domain.Student;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        Set set = new TreeSet();

        set.add(new Student("1111",23));
        set.add(new Student("222",12));
        set.add(new Student("333",26));
        set.add(new Student("444",11));

        int a = set.size();
        System.out.println(a);



        Iterator it = set.iterator();
        while (it.hasNext()){

            Student stu = (Student) it.next();
            System.out.println(stu.getName() +"-------------"+stu.getAge());
        }
    }
}
