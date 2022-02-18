package com.company.easy.removeelements;

public class Solution {


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7}; // Input array
        System.out.println(removeElement(nums, 7));


    }


    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
