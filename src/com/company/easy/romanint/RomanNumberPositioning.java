package com.company.easy.romanint;

import java.util.Map;

public class RomanNumberPositioning {

  public static final Map<String, Integer> ROMAN_TO_INT = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500,
      "M", 1000);

  public static boolean addOrSubtract(String current, String before) {
    if (current.equals(before)){
      return true;
    }else
      return ROMAN_TO_INT.get(current) > ROMAN_TO_INT.get(before);
  }



}
