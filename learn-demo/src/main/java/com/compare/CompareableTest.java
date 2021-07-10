package com.compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: learn-demo
 * @description:
 * @author: LWB
 * @create: 2019-08-15 09:28
 **/
public class CompareableTest {

    @Test
    public void test(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("mi",40);
        arr[1] = new Goods("cai",10);
        arr[2] = new Goods("yashua",4);
        arr[3] = new Goods("baozi",20);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }



    @Test
    public void test1(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("mi",40);
        arr[1] = new Goods("cai",10);
        arr[2] = new Goods("cai",100);
        arr[3] = new Goods("yashua",4);
        arr[4] = new Goods("baozi",20);

        Arrays.sort(arr, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                if (o1.getName().equals(o2.getName())){
                    if (o1.getPrice() > o2.getPrice()){
                        return 1;
                    }else if (o1.getPrice() < o2.getPrice()){
                        return -1;
                    }
                }else {
                    return o1.getName().compareTo(o2.getName());
                }

                throw new RuntimeException("输入数据有误");
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
