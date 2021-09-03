package com.company.easy.reversinteger;

/*
* Given a signed 32-bit integer x, return x with its digits reversed.
* If reversing x causes the value to go outside the signed 32-bit
* integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
Example 4:

Input: x = 0
Output: 0


Constraints:

-231 <= x <= 231 - 1*/
public class Solution {

  public static int reverse(int x) {
    int MAX_POSSIBLE_REVERSE_NUM = 2147483412;
    if(x > MAX_POSSIBLE_REVERSE_NUM){
      return 0;
    }
    int temp = x;
    int result = temp % 10;
    temp = temp / 10;
    while (temp != 0) {
      if(Math.abs(result) > Integer.MAX_VALUE / 10)
        return 0;
      result = (result * 10) + (temp % 10);
      temp = temp / 10;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(reverse(1463847412));
  }

}
