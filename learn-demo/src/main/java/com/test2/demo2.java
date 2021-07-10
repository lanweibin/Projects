package com.test2;

/**
 * @program: learn-demo
 * @description:
 * @author: LWB
 * @create: 2020-12-09 15:43
 **/
public class demo2 {
    public static void main(String[] args) {


        System.out.println(judgeSquareSum(6));
        System.out.println(judgeSquareSum(5));
        System.out.println(judgeSquareSum(4));


    }

    public static boolean judgeSquareSum(int c) {
        if (c % 2 == 0) {
            if ((c - 1) % 2 == 0 && (c - 1) > 2) {
                return true;
            }else if((c - 1) % 2 == 0) {
                return true;
            }else {
                return true;
            }
        }else if ((c - 1) % 2 == 0 && (c - 1) > 2){
            return true;
        } else if (c == 1) {
            return true;
        } else {
            return false;
        }
    }
}
