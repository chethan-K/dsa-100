package com.dsa.init.arrays;

import java.util.Arrays;

public class RightRotateArray {
    public static void main(String args[]) {

        int[] arr = {1,2,3,4,5};
        int k = 5;
        int[] newArr = new int[arr.length];
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            int index  = i + k;
            if( index >= arrLength){
                index = index % arrLength ;
            }
            newArr[i] = arr[index];
        }
        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
        System.out.println("");
        Arrays.stream(newArr).forEach(a -> System.out.print(a + " "));
    }
}
//0,1,2,3,4
//2,3,4,0,1
//n = 5
//k = 2

