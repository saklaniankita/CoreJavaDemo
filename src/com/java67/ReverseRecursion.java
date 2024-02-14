package com.java67;

public class ReverseRecursion {
    public static void main(String[] args) {
        String input = "ankita";
        String reversedString = "";
        System.out.println(reverse(input, reversedString, input.length() - 1));
    }

    static String reverse(String str, String reversedString, int index) {
        reversedString = reversedString.concat(String.valueOf(str.charAt(index)));
        index--;
        if (index == -1) {
            return reversedString;
        }
        else
            return reverse(str,reversedString, index);
    }
}
