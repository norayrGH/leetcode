package com.company.medium.longestPalindromSubstring;

public class Solution {

  static int resultStart;
  static int resultLength;

  public static String longestPolindrome(String s) {

    int strLength = s.length();
    if (strLength < 2) {
      return s;
    }
    for (int start = 0; start < strLength; start++) {
      expandRange(s, start, start);
      expandRange(s, start, start + 1);
    }
    return s.substring(resultStart, resultStart + resultStart);
  }

  private static void expandRange(String str, int begin, int end) {
    while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
      begin--;
      end++;
    }
    if (resultLength <end - begin -1){
      resultStart = begin+1;
      resultLength = end -begin-1;
    }
  }

}

