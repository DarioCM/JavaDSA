package org.example.algorithms.sort;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {

        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 1, 10);

    }

    public static void countingSort(int[] input, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (var num : input) {
            countArray[num - min]++;
        }
        System.out.println(Arrays.toString(countArray));

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }

        System.out.println(Arrays.toString(input));
    }

}
