package com.company.easy.romanint;

import static com.company.easy.romanint.RomanNumberPositioning.*;

import java.util.Map;

class Solution {


  public static int romanToInt(String s) {
    int result = ROMAN_TO_INT.get(String.valueOf(s.charAt(s.length() - 1)));
    for (int i = s.length() - 2; i >= 0; i--) {
      String currentRoman = String.valueOf(s.charAt(i));
      String beforeRoman = String.valueOf(s.charAt(i + 1));
      if (addOrSubtract(currentRoman, beforeRoman)) {
        result = result + ROMAN_TO_INT.get(currentRoman);
      } else {
        result = result - ROMAN_TO_INT.get(currentRoman);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(romanToInt("MCMXCIV"));
  }
}
