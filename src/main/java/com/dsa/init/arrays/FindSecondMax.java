package com.dsa.init.arrays;

/**
 *
 * Finding the second maximum or minimum.
 * Initialise secondMax, max to minimum possible value
 * iterate - compare array element with max, if value is greater than max - set max key with that value and set secondMax with that max value
 * else compare array element with secondMax, if value is greater than max - set max key with that value
 *
 */
public class FindSecondMax {
    public static void main(String args[]) {
        int[] arr = {1,2,3};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MIN_VALUE;

        // finding the second max
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                thirdMax = secondMax;
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax){
                secondMax = arr[i];
                thirdMax = secondMax;
            } else if (arr[i] > thirdMax){
                thirdMax = arr[i];
            }
        }

        // finding the second min
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin){
                secondMin = arr[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("secondMax: " + secondMax);
        System.out.println("thirdMax: " + thirdMax);

        System.out.println("min: " + min);
        System.out.println("secondMin: " + secondMin);
    }
}
