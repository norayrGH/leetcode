package com.company.easy.smalestnumocurearray;

public class Solution {
  public static String solution(String message, int K) {
    String [] splitedString = message.split(" ");
    StringBuilder result = new StringBuilder("");
    for(int i = 0; i < splitedString.length; i++){

      if(splitedString[i].length() < K){
        if(i!=0){
          result.append(" ").append(splitedString[i]);
          K=K-splitedString[i].length()-1;
        }else{
          result.append(splitedString[i]);
          K=K-splitedString[i].length();
        }

      }


    }
    return result.toString();


  }

  public static void main(String[] args) {
    System.out.println(solution("To crop or not to crop", 21));
  }
}
