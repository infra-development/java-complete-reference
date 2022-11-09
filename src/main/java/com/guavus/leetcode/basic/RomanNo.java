package com.guavus.leetcode.basic;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNo {
    public static void main(String[] args) {
        System.out.println(romanToInt("MMMDCCCLXXXVIII"));
    }

    public static int romanToInt(String s) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        mp.put(1, 1);
        mp.put(2, 5);
        mp.put(3, 10);
        mp.put(4, 50);
        mp.put(5, 100);
        mp.put(6, 500);
        mp.put(7, 1000);
        char[] chars = {'I','X','C'};
        char[] allChars = {'O', 'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] intArray = new int[15];
        int index = 0;

        int slen = s.length();
        //System.out.println("length of string : "+slen);
        int sum = 0;

        for(int i=0; i<slen; i++) {
            char ch = s.charAt(i);
            for(int j = 0; j<allChars.length; j++) {
                if (ch == allChars[j]) {
                    intArray[i] = j;
                }
            }
        }
//        for(int i =0; i < intArray.length; i++) {
//            System.out.print(intArray[i]+ " ");
//        }

        for(int i=0; i < intArray.length && intArray[i] != 0; i++) {
            if(i == intArray.length - 1) {
                sum = mp.get(intArray[i]) + sum;
            } else if(intArray[i] > intArray[i+1]) {
                sum = mp.get(intArray[i]) + sum;
            } else if (intArray[i] < intArray[i+1]) {
                sum = sum + mp.get(intArray[i+1]) - mp.get(intArray[i]);
                i++;
            } else if (intArray[i] == intArray[i+1]) {
                sum = mp.get(intArray[i]) + sum;
            }
        }
        //System.out.println();
        return sum;
    }
}
