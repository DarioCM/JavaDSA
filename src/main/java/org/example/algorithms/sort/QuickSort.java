package org.example.algorithms.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray,0,intArray.length);

        System.out.println(Arrays.toString(intArray));

    }

    public static void quickSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);

        quickSort(input, start, pivotIndex); //left
        quickSort(input, pivotIndex + 1, end); //right

    }

    public static int partition(int[] input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j]; // that means that we move to the left the element because is lower than the pivot
            }

            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i]; // that means that we move to the right the element because is greater than the pivot
            }

        }

        input[j] = pivot;
        return j;
    }

}
