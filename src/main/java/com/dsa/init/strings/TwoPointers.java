package com.dsa.init.strings;

import java.util.ArrayList;
import java.util.List;

public class TwoPointers {

    public static void main(String[] args) {
    }

    public static Boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static Boolean sumToTarget(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int current = nums[left] + nums[right];
            if( current == target) {
                return true;
            }

            if(current < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }


    public static List<Integer> mergeSortedArray(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                ans.add(nums1[i]);
                i++;
                j++;
            } else if(nums1[i] < nums2[j]) {
                ans.add(nums1[i]);
                i++;
            } else {
                ans.add(nums2[j]);
                j++;
            }
        }

        while(j < nums2.length) {
            ans.add(nums2[j]);
            j++;
        }

        while(i < nums1.length) {
            ans.add(nums1[i]);
            i++;
        }
        return ans;
    }

    public static char[] reverseStr(char[] strArr) {
        int left = 0;
        int right = strArr.length - 1;

        while (left < right) {
            char tmp = strArr[left];
            strArr[left] = strArr[right];
            strArr[right] = tmp;
            left ++;
            right --;
        }
        return strArr;
    }


    public static int[] sortSquareOfSortedArr(int[] nums) {
        int left = 0;
        int arrLength = nums.length;
        int right = arrLength - 1;
        int[] ans =  new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[arrLength - 1 - i] = nums[left];
                left++;
            } else {
                ans[arrLength - 1 - i] = nums[right];
                right--;
            }
        }
        return ans;
    }
}
