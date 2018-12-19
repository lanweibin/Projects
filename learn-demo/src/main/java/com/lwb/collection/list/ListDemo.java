package com.lwb.collection.list;

import com.lwb.entity.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    @Test
    public void addList() {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge("13");

        Student s2 = new Student();
        s2.setName("张四");
        s2.setAge("14");

        Student s3 = new Student();
        s3.setName("张五");
        s3.setAge("15");

        List<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);



        List<Student> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "---" +list.get(i).getAge());

            if (i == list.size()-1 ){
                list1.add(list.get(i));
                System.out.println(list1.size());
            }
        }

        for (Student stu : list1){
            System.out.println(stu.getName() +"===="+ stu.getAge());
        }
    }

}
