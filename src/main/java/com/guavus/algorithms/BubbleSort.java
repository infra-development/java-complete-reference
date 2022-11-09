package com.guavus.algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {10, 30, 20, 15, 25, 35, 45, 65, 40, 50, 75, 55};

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i=0; i<lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i+1);
                }
            }
        }

        for(int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    public static void swap(int[] intArray, int index1, int index2) {
        int temp = intArray[index1];
        intArray[index1] = intArray[index2];
        intArray[index2] = temp;
    }

}
