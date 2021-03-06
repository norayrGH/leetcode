package com.company;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 10 3
-109 <= nums[i] <= 10 9
-109 <= target <= 10 9
Only one valid answer exists.*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class TwoSums {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> numsMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      numsMap.putIfAbsent(nums[i], i);
      Integer keyForCheck = target - nums[i];
      Integer value = numsMap.get(keyForCheck);
      if(Objects.nonNull(value) && value != i){
        return new int[]{i,numsMap.get(keyForCheck)};
      }
    }
    throw new IllegalArgumentException("Can not find any answer in this array.");
  }

  public static void main(String[] args) {
    TwoSums twoSums = new TwoSums();
    int[] ints = twoSums.twoSum(new int[]{3,2,4}, 6);
    Arrays.stream(ints).forEach(System.out::println);

  }
}
