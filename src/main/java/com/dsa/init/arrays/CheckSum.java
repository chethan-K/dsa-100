package com.dsa.init.arrays;

import java.util.Arrays;

class CheckSum {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 6, 9};
        int sum = 9;
//        checkSum(arr, sum);
        checkSumSorted(arr, sum);
    }

    // Simple brute force method - where list is not sorted O(n2)
    public static void checkSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for(int j=1; j < arr.length - i; j++){
                if (arr[i] + arr[i + j] == sum) {
                    System.out.println(arr[i] + ", " + arr[i + j]);
                }
            }
        }
    }

    // Given the list is sorted
    // create pointer1 and pointer2 pointing beginning and end of the array
    // start moving pointer1, pointer2 closer
    // if the sum is greater than the target - move pointer2 right
    // if the sum is lesser than the target - move pointer1 left
    public static void checkSumSorted(int[] arr, int sum) {
        int pointer1 = 0;
        int pointer2 = arr.length - 1;

        while(pointer1 != pointer2){
            int aSum = arr[pointer1] + arr[pointer2];
            if(aSum < sum){
                pointer1++;
            } else if(aSum > sum) {
                pointer2--;
            } else {
                System.out.println(arr[pointer1] + ", "+ arr[pointer2]);
                break;
            }
        }
    }

}
