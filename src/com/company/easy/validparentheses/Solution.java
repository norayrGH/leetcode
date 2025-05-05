package com.company.easy.validparentheses;

import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;
import java.util.stream.IntStream;

class Solution {

  private static HashMap<Character, Character> closeScope = new HashMap<>() {

    {
      put('{', '}');
      put('(', ')');
      put('[', ']');
    }
  };

  public static boolean isValid(String s) {
    Stack<Character> characters = new Stack<>();
    characters.push(s.charAt(0));
    for (int i = 1; i < s.length(); i++) {
      char current = s.charAt(i);
      if (!characters.isEmpty() && closeScope.containsKey(characters.peek()) && closeScope.get(characters.peek())
          .equals(current)) {
        characters.pop();
      } else {
        characters.push(current);
      }
    }
    return characters.isEmpty();
  }


  public static void main(String[] args) {
    System.out.print( isValid("[{]}{}"));
  }
}
