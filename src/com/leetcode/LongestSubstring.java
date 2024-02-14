package com.leetcode;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string s,
 * find the length of the longest substring without repeating characters.
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 */
public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(longestSubstring("dvdf"));
//        System.out.println("au".length());
//        System.out.println(" ".length());
    }

    private static int longestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        if(s.length() == 1)
            return 1;
        int length = s.length();
        int longestStringLength = 0;
        int currentLength = 0;
        String first = s.substring(0, 1);
        int firstIndex = 1;
        for (int i = firstIndex; i < length; i++) {
            String tmp = s.substring(i, i+1);
            if(!first.contains(tmp)){
                first = first + tmp;
                continue;
            }else{
                currentLength = first.length();
                if(currentLength > longestStringLength){
                    longestStringLength = currentLength;
                }

                first = s.substring(i, i+1);
                firstIndex = i + 1;
                continue;
            }
        }
        currentLength = first.length();
        if(currentLength > longestStringLength){
            longestStringLength = currentLength; //
        }
        return longestStringLength;
    }
}
