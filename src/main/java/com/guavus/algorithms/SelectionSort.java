package com.guavus.algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {10, 30, 20, 15, 25, 35, 45, 65, 40, 50, 75, 55};
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int maxValue = 0;
            for(int i=1; i <= lastUnsortedIndex; i++) {
               if(intArray[i] > intArray[maxValue]) {
                   maxValue = i;
               }
            }
            swap(intArray, maxValue, lastUnsortedIndex);
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
