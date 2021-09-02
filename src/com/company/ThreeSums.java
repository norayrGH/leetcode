package com.company;

/*Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
Notice that the solution set must not contain duplicate triplets.*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class ThreeSums {

  public static int[] twoSum(int[] nums, int target, int skip) {
    Map<Integer, Integer> numsMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (i == skip) {
        continue;
      }

      int[] ints = new int[2];
      numsMap.putIfAbsent(nums[i], i);
      Integer keyForCheck = target - nums[i];
      Integer value = numsMap.get(keyForCheck);
      if (Objects.nonNull(value) && value != i) {
        return new int[]{i, numsMap.get(keyForCheck)};
      }
    }
    return new int[0];
  }

  public static void main(String[] args) {
    int[] ints = {-1, 0, 1, 2, -1, -4};
    HashMap<Integer,List<Integer>> resultMap = new HashMap<>();

    for (int i = 0; i < ints.length; i++) {
      int[] ints1 = twoSum(ints, - ints[i], i);
      if (ints1.length == 2) {
        Arrays.sort(ints);
      }
      System.out.println("for " + ints[i] + " [ " + ints[ints1[0]] + ", " + ints[ints1[1]] + " ]");
    }


  }
}
