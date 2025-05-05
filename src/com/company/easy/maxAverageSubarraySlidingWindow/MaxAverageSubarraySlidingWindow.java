package com.company.easy.maxAverageSubarraySlidingWindow;

class MaxAverageSubarraySlidingWindow {

  public static double findMaxAverage(int[] nums, int k) {

    int sum = 0;
    for (int i = 0; i < k; i++) {
      sum += nums[i];
    }
    int maxSum = sum;

    for (int i = k; i < nums.length; i++) {
      sum += nums[i];
      sum -= nums[i - k];
      maxSum = Math.max(maxSum, sum);
    }
    return (double) maxSum / k;
  }

  public static void main(String[] args) {

    System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50, 3}, 4));
  }
}
