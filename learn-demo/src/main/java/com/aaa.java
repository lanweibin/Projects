package com;

import com.lwb.entity.Student;
import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class aaa {

    public static void main(String[] args) {
        Student student1 = new Student("11","33");
        Student student2 = new Student("11","34");
        Student student3 = new Student("22","55");
        Student student4 = new Student("22","34");
        Student student5 = new Student("33","66");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        List<Student> resList= new ArrayList<Student>();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (Student student : list) {
            if (student == null) {
                continue;
            }
            String  userName = student.getName();
            if (userName != null) {
                // String listIdStr = listId.longValue() + "";
                String value = hashMap.get(userName);
                if (StringUtils.isBlank(value)) { //如果value是空的  说明取到的这个userName是第一次取到
                    hashMap.put(userName, userName);
                    resList.add(student); //list1就是我们想要的去重之后的结果
                } else {
                    continue;
                }
            }
        }
        for (Student stu: resList) {
            System.out.println(stu.getName() +"---------"+ stu.getAge());
        }
    }
}
