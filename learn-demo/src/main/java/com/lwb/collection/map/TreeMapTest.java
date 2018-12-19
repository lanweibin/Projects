package com.lwb.collection.map;

import com.lwb.entity.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

//        自定义比较器
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int temp = o1.getName().compareTo(o2.getName());
                return temp==0 ? o1.getAge() - o2.getAge() : temp;
            }
        };

        TreeMap<Employee, String> map = new TreeMap<>(comparator);

        map.put(new Employee("aaa", 23),"北京");
        map.put(new Employee("bbb", 12),"上海");
        map.put(new Employee("ccc", 33),"南京");
        map.put(new Employee("ddd", 22),"合肥");


        for (Map.Entry<Employee, String> maps : map.entrySet()){

            String value = maps.getValue();
            System.out.println(maps.getKey().getName() + "----"+ maps.getKey().getAge() +"----"+ value);
        }
    }
}
