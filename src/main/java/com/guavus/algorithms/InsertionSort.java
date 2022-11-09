package com.guavus.algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {10, 30, 20, 15, 25, 35, 45, 65, 40, 50, 75, 55};

        for (int firstUnsortedElement=1; firstUnsortedElement < intArray.length; firstUnsortedElement++)  {
            int newElement = intArray[firstUnsortedElement];
            int i;
            for(i = firstUnsortedElement; i > 0 && intArray[i-1] > newElement; i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }

        for (int j : intArray) {
            System.out.println(j);
        }
    }
}
