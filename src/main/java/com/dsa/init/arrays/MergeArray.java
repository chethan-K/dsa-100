package com.dsa.init.arrays;

import java.util.Arrays;

/**
 * Given 2 sorted array - merge array
 *
 *
 */
class MergeArray {

    public static void main( String args[] ){
        int[] arr1 = {1,2,3,4,5,7};
        int[] arr2 = {2,5,6};
        int[] result = mergeArrays(arr1, arr2);
        Arrays.stream(result).forEach((r)-> System.out.println(r));
    }

    // merge arr1 and arr2 into a new result array
    public static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int[] arr3 = new int[arr1Length + arr2Length];
        int arr1Index = 0;
        int arr2Index = 0;
        int arr3Index = 0;

        /**
         * iterate till array index are less than the array length
         * if the arr1 element is greater than arr2 element
         * - push the value to superArr
         * else
         * - push the the arr2 value to super Arr
         *
         * then iterate over remaining lenght of both the arrays and back fill the elements
         */
        while (arr1Index < arr1Length && arr2Index < arr2Length){
            if(arr1[arr1Index] < arr2[arr2Index]){
                arr3[arr3Index++] = arr1[arr1Index++];
            } else {
                arr3[arr3Index++] = arr2[arr2Index++];
            }
        }

        // Store remaining elements of first array
        while (arr1Index < arr1Length)
            arr3[arr3Index++] = arr1[arr1Index++];

        // Store remaining elements of first array
        while (arr2Index < arr2Length)
            arr3[arr3Index++] = arr2[arr2Index++];

        return arr3;
    }
//    Time complexity O(n+m)
}
