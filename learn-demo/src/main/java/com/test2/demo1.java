package com.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: learn-demo
 * @description:
 * @author: LWB
 * @create: 2020-12-09 15:35
 **/
public class demo1 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] test = intersect(nums1, nums2);

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);

        }

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int num : nums1) {
            list1.add(num);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int num : nums2) {
            if (list1.contains(num)) {
                list2.add(num);
                list1.remove(Integer.valueOf(num));
            }
        }
        int[] result = new int[list2.size()];
        for (int x=0; x<list2.size(); x++) {
            result[x] = list2.get(x);
        }

        return result;


    }
}
