package com.java67;

/**
 * Reverse words in a given sentence without using any library method?
 **/
public class ReverseSentence {
    public static void main(String[] args) {
        String[] resultArr = reverse("my name is ankita");

        //System.out.println(resultArr.length-1);
        for (int i = 3; i >= 0; i--) {
            System.out.print(resultArr[i] + " ");
        }
    }

    private static String[] reverse(String sentence) {
        String[] words = sentence.split(" ");

        return words;
    }
}
