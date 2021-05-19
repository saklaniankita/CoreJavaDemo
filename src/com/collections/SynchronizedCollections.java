package com.collections;

import java.util.*;

public class SynchronizedCollections {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List syncList = Collections.synchronizedList(list);
		syncList.add("a");
		syncList.add("b");

		Set<String> set = new HashSet<String>();
		Set syncSet = Collections.synchronizedSet(set);
		syncSet.add("hsgh");
		syncSet.add("uyi");

		Map<Integer, String> map = new HashMap<Integer, String>();
		Map syncMap = Collections.synchronizedMap(map);
		syncMap.put(1, "abc");
		syncMap.put(2, "cde");
	}
}
