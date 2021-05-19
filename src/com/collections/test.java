package com.collections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class test {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

		map.put("First", 10);
		map.put("Second", 20);
		map.put("Third", 30);
		map.put("Fourth", 40);

		Iterator<String> iterator = map.keySet().iterator();
		int i = 1;
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(i);
			i++;
			map.put("Fifth", 50);
		}
		System.out.println(i);
	}
}
