package com.collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map map1 = new HashMap();
        Map map2 = new LinkedHashMap();
       //Map map3 = new Hashtable();
        Map map4 = new TreeMap();

        map1.put(null, 1);
        map2.put(null, 1);
        //map3.put(null, 1);
        map4.put(null, 1);


    }
}
