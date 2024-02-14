package com.java67;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCharactersInAString {
    public static void main(String[] args) {
        List<Character> result = new ArrayList<>();
        String str = "helloe";
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!charCountMap.containsKey(str.charAt(i))) {;
                charCountMap.put(str.charAt(i), 1);
            } else {
                char c = str.charAt(i);
                if(!result.contains(c)){
                    result.add(c);
                }
                int count = charCountMap.get(str.charAt(i));
                charCountMap.replace(str.charAt(i),++count);
            }
        }
        System.out.println(result);
    }

}
