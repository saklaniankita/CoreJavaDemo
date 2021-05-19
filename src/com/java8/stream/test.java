package com.java8.stream;

import java.util.*;

public class test {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "hjs");
		map.put(2, "uii");
		
		//METHOD 1
		System.out.println("METHOD1 :");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key :"+entry.getKey()+" value :"+entry.getValue());
		}
		
		//METHOD 2
		System.out.println("METHOD 2:");
		for(Integer key : map.keySet())
			System.out.println(key);
		for(String value : map.values())
			System.out.println(value);
		
		//METHOD 3:
		System.out.println("METHOD 3: ");
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println("key : "+itr.next().getKey());
			System.out.println(("value : "+itr.next().getValue()));
		}
		
		//EASIEST WAY
		System.out.println("METHOD 4 : ");
		map.forEach((k,v) -> System.out.println("key :"+k+" value : "+v));
	}
}
