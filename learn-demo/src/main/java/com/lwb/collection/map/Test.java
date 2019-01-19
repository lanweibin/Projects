package com.lwb.collection.map;

import com.lwb.entity.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<Student, String> map = new LinkedHashMap<>();

        map.put(new Student("11","11"),"one");
        map.put(new Student("22","22"),"two");
        map.put(new Student("33","33"),"three");
        map.put(new Student("44","444"),"four");

//        for (Map.Entry<Student, String>  maps : map.entrySet()){
//            System.out.print(maps.getKey().getName() + "-----" + maps.getKey().getAge()+"-------");
//            System.out.println(maps.getValue());
//        }

        for (Student maps : map.keySet()){
            System.out.println(maps.getName() + "---" + maps.getAge() + "-----"+ map.get(maps));

        }
    }

    private static void method1(Map map) {

    }
}
