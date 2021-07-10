package com;

import com.lwb.domain.Person;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: learn-demo
 * @description:
 * @author: LWB
 * @create: 2019-09-03 14:46
 **/
public class Demo {
    public static void main(String[] args) {
//        final Person person = new Person();
//        System.out.println(person.getName());
//        person.setName("张三");
//        System.out.println(person.getName());\

//        int[] arr1 = {1,2,3,0,0,0};
//        int[] arr2 = {2,5,6};
//
//        int[] result = merge(arr1, 3, arr2, 3);
//        for (int a : result){
//            System.out.println(a);
//        }


        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        System.out.println(sdf.format(date));

        long a = System.currentTimeMillis();
        Date date1 = new Date(a);
        System.out.println(a);



    }


   public static  int[] merge(int[] nums1, int m, int[] nums2,int n){
        int k = m+n-1;
        int i = m-1;
        int j = n-1;
        while (i >=0 && j>=0){
            if (nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else {
                nums1[k--] = nums2[j--];
            }
        }

        if (i > 0){
            while (i >= 0){
                nums1[k--] = nums1[i--];
            }
        }
        if (j >= 0){
            while (j >= 0){
                nums1[k--] = nums2[j--];
            }
        }

        return nums1;
   }




}

