package com.lwb.leetcode;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("请输入三个数");
        Scanner sc = new Scanner(System.in);
        double a = Integer.parseInt(sc.nextLine());
        double b = Integer.parseInt(sc.nextLine());
        double c = Integer.parseInt(sc.nextLine());

        System.out.println( a + b + c);

        double avg = (a + b + c)/3;
        System.out.println(avg);
    }
}
