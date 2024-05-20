package org.example.algorithms.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int unsortedIndex = 1; unsortedIndex < intArray.length; unsortedIndex++) {
            int newElement = intArray[unsortedIndex];
            int i;
            for (i = unsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1]; // grather go to the right
            }
            intArray[i] = newElement;
        }

        System.out.println(Arrays.toString(intArray));


    }
}
