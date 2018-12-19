package com.lwb.collection.map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAndMap {

    @Test
    public void test(){
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        Map<String,String> map3 = new HashMap<>();
        map1.put("1","111111111");
        map1.put("2","2222222222");
        map1.put("3","33333333");

        map2.put("4","44444444");
        map2.put("5","555555");
        map2.put("6","66666666");

        map3.put("7","77777777");
        map3.put("8","88888");
        map3.put("9","9999999999");

        List<Map<String,String>> list = new ArrayList<>();
        list.add(map1);list.add(map2);list.add(map3);

        for (Map<String,String> map : list) {
            if (list.size() == 3) {
                for (Map.Entry<String,String> mm : map.entrySet()){
                    System.out.print(mm.getKey() +"     ");
                    System.out.println(mm.getValue());
                }
            }

        }

        System.out.println("===========================");
        //取出list集合最后一位
        List<Map<String, String >> list2 = new ArrayList<>();
        list2.add(list.get(list.size() - 1));
        for (Map<String,String> map : list2) {
                for (Map.Entry<String,String> mm : map.entrySet()){
                    System.out.print(mm.getKey() +"     ");
                    System.out.println(mm.getValue());
            }

        }

    }
}
