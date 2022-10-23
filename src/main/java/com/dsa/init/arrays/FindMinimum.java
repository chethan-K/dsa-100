package com.dsa.init.arrays;

class FindMinimum {

    public static void main(String args[]) {
        int[] arr1 = {-1, 1, 2, 3, 0, 5, 7};
        int result = findMinimum(arr1, Integer.MAX_VALUE, 0);
        System.out.println(result);
    }

    // Recursion method to find minimum value from array
    // circuit breaker -> when all the values are iterated
    public static int findMinimum(int[] arr, int minimumValue, int index) {
        if (arr.length == index) {
            return minimumValue;
        }
        if (arr[index] < minimumValue) {
            minimumValue = arr[index];
        }
        return findMinimum(arr, minimumValue, index + 1);
    }
}
