package com.guavus.leetcode.basic;

public class Palindrom {
    public static void main(String[] args) {
        int a = 1232321;
        int sum = 0;
        while(a > 0) {
            sum = sum*10 + a%10;
            a = a/10;
        }
        System.out.println(sum);
    }
}
