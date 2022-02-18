package com.company.hackerrank.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution<T> {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        List<String> listString = new ArrayList<>();
        Solution<String> solution = new Solution<>();
        solution.printArray(listString);
        List<Integer> listInteger = new ArrayList<>();
        Solution<Integer> solution2 = new Solution<>();
        solution2.printArray(listInteger);

    }


    public void printArray(List<T> list){
        list.forEach(System.out::println);

    }
}
