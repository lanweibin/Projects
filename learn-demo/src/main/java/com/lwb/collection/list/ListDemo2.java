package com.lwb.collection.list;

import com.lwb.entity.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
   @Test
    public void listFor() {
       Student s1 = new Student();
       s1.setName("张三");
       s1.setAge("13");

       Student s2 = new Student();
       s2.setName("张四");
       s2.setAge("14");

       Student s3 = new Student();
       s3.setName("张五");
       s3.setAge("15");

       List<String > list = new ArrayList<>();

      Iterator it = list.iterator();
      while (it.hasNext()) {

      }



   }
}
