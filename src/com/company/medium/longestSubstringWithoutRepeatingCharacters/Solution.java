package com.company.medium.longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()){
            return 0;
        }
        Set<Character> repeat = new HashSet<>();
        int leftP = 0;
        int result = 0;
        for(int rightP = 0; rightP < s.length(); rightP++){
            char curr = s.charAt(rightP);
            while(repeat.contains(curr)){
                repeat.remove(s.charAt(leftP));
                leftP++;
            }
            repeat.add(curr);
            result = Math.max(result, rightP-leftP + 1);

        }
        return result;
    }
}
