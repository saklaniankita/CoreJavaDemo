package com.java67;

import java.util.Map;
import java.util.TreeMap;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(createTreeMap("caabb").equals(createTreeMap("abacb")));
    }

    static Map<Character, Integer> createTreeMap(String str) {
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if(!map.containsKey(c))
                        map.put(c, 1);
                    else{
                        int value = map.get(c);
                        value++;
                        map.replace(c,value);
                    }
        }
        System.out.println(map);
        return map;
    }
}
