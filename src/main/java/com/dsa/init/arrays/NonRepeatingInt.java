package com.dsa.init.arrays;

public class NonRepeatingInt {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int result = nonRepeatingInt(arr);
//        System.out.println(result);
    }

    // Recursive
    public static int nonRepeatingInt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeated = false;
            System.out.println(arr[i]);
            for (int j = 0; j <= arr.length - (i+1+1); j++) {
//                System.out.print(j + "--> ");
                System.out.println(" --> " + arr[j] + " ");
//                if(arr[i] == arr[j]){
//                    isRepeated = true;
//                    break;
//                }
            }
            System.out.println("");
//            if(!isRepeated){
//                return arr[i];
//            }
        }
        return 0;
    }
}
