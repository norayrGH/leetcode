package com.company.easy.polindromNumber;

class Solution {

  public static boolean isPalindrome(int x) {
    int copy = x;
    int temp = 0;
    if(x<0){
      return false;
    }else if (x/10==0){
      return true;
    }

    do {
      temp = (temp * 10) + copy % 10;
      copy = copy / 10;
    } while (copy / 10 != 0);
    temp = (temp * 10) + copy % 10;
    return temp == x;
  }


  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
  }
}
