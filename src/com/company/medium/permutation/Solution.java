package com.company.medium.permutation;

import java.util.ArrayList;
import java.util.List;
/*Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]


Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.*/
class Solution {
    static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];  //boolean array to store indexes visited
        for(int i=0; i<nums.length; i++){
            visited[i] = true;
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            helper(nums, temp, visited);
            visited[i] = false;
            temp.remove(temp.size()-1);
        }
        return ans;
    }
	public static void helper(int[] nums, ArrayList<Integer> temp, boolean[] visited){
        if(temp.size() == nums.length){
            ans.add(new ArrayList(temp));   // add new arraylist to final ans
	        return;
	    }
        
	    for(int i=0; i<nums.length; i++){
	        if(!visited[i]){
	            visited[i] = true;   // mark ith position as visited
                temp.add(nums[i]);   // add nums[i] to temporary list
	            helper(nums, temp, visited);  // call helper fucntion and pass updated temp List
                temp.remove(temp.size()-1);   // remove last element of temp List (backtracking)
	            visited[i] = false;         // mark ith position as unvisited so that other helper
                                            // other helper functions can visit it
	        }
	    }
	    return;
    }
}