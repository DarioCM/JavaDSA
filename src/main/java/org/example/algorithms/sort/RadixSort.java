package org.example.algorithms.sort;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {

        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray,10,4);

        System.out.println(Arrays.toString(radixArray));

    }

    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(int[] input, int position, int radix) {

        int numItems = input.length;

        int[] countarray = new int[radix];

        for (var value : input) {
            countarray[getDigit(position, value, radix)]++;
        }

        //adjust the count array
        for(int j=1; j < radix; j++){
            countarray[j] += countarray[j-1];
        }

        int[] temp = new int[numItems];
        for(int tempIndex = numItems-1; tempIndex >=0; tempIndex--) {
            temp[--countarray[getDigit(position,input[tempIndex],radix)]] =
                    input[tempIndex];
        }


        System.arraycopy(temp,0,input,0,temp.length);


    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(10, position) % radix;
    }

}
