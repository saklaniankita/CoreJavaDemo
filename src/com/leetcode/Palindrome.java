package com.leetcode;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ankita"));
    }

    private static String longestPalindrome(String s) {
        int length = s.length();
        String palindrome;
        String longestPalindrome = "";
        String temp;
        if (length == 1)
            return s;
        else if (length == 2 && s.charAt(0) == s.charAt(1))
            return s;
        else if (length == 2 && s.charAt(0) != s.charAt(1))
            return s.substring(0, 1);
        else {
            for (int i = 1; i < length - 1; i++) {
                palindrome = s.substring(i, i + 1);
                int noOfRightChars = length - (i + 1);
                int noOfLeftChars = length - noOfRightChars - 1;
                int count = noOfLeftChars < noOfRightChars ? noOfLeftChars : noOfRightChars;
                for (int j = 1; j <= count; j++) { //i
                    if (s.charAt(i - j) == s.charAt(i + j)) {
                        temp = String.valueOf(s.charAt(i - j));
                        palindrome = temp + palindrome + temp;
                    } else if (palindrome.charAt(0) == s.charAt(i + j)) {
                        palindrome = palindrome + s.charAt(i + j);
                    }else if(palindrome.charAt(0) == s.charAt(i - j)){
                        palindrome = palindrome + s.charAt(i - j);
                    }
                    if (palindrome.length() >= longestPalindrome.length())
                        longestPalindrome = palindrome;
                }
            }
            return longestPalindrome;
        }
    }
}
