package com.company.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StremApi {
  //Find the Most Frequent Element in a List
  public static void main(String[] args) {
    List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
    String mostFrequent = words.stream()
        .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
      .entrySet().stream()
      .max(Entry.comparingByValue())
      .map(Entry::getKey)
      .orElse(null) ;
    //System.out.println(mostFrequent);
    System.out.println(findtheFirstNonRepeatedCharacterinaString());
  }

  //Find the First Non-Repeated Character in a String

  public static Character findtheFirstNonRepeatedCharacterinaString() {
    String input = "hello";
     return input
      .chars()
      .mapToObj(c -> (char) c)
      .collect(Collectors.groupingBy(each -> each, LinkedHashMap::new, Collectors.counting()))
      .entrySet().stream()
      .max(Entry.comparingByValue())
      .map(Entry::getKey)
      .orElse(null);
  }

  //Check if a String is a Palindrome
  public static boolean checkifaStringisaPalindrome() {
    String input = "madam";
    return IntStream.range(0, input.length() / 2)
      .allMatch(i -> input.charAt(i) == input.charAt(input.length() - 1 - i));

  }


  public static void fibonachi() {
    Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
      .limit(10)
      .map(fib -> fib[0])
      .forEach(System.out::println);
  }



}
