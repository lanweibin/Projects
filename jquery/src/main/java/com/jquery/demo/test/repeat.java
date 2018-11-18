package com.jquery.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 去除重复的list<Object> 中的字符
 */
public class repeat {
    public static void main(String[] args) {
        List<Person> l = new ArrayList<Person>();
        Person s=new Person();
        s.setId(1);
        s.setName("小崔");
        s.setAge("20");
        Person s1=new Person();
        s1.setId(2);
        s1.setName("小五");
        s1.setAge("20");
        Person s2=new Person();
        s2.setId(3);
        s2.setName("小崔");
        s2.setAge("20");
        Person s3=new Person();
        s3.setId(4);
        s3.setName("小五");
        s3.setAge("20");
        Person s4=new Person();
        s4.setId(5);
        s4.setName("小六");
        s4.setAge("20");
        l.add(s);
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);


        for(Person i:l){
            System.out.println(i.getId());
            System.out.println(i.getName());
            System.out.println(i.getAge());
        }

//        Map map = new HashMap<String,Person>();
//        for(Person i:newList){
//            map.put(i.getName(),i);
//        }

//        List<Person> a = new  ArrayList<Person>();
//        for (String key : map.keySet()) {
//            a.add(map.get(key));
//        }
//        for(Person i:a){
//            System.out.println(i.getId());
//            System.out.println(i.getName());
//            System.out.println(i.getAge());
//        }

    }


    public List<Object> clean(List<Object> list){


        return list;
    }
}

