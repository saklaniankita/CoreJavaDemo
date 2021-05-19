package com.java8.lambdafunction;

import java.util.*;

public class ForEachClass {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "A");
		
		
		//OLDER WAY
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		//NEW WAY
		map.forEach((key, value) -> {System.out.println(key+" "+value);});
	}
}
