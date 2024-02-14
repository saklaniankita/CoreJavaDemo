package com.java8.stream.intermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * map() applies function on each element of one stream and produces another
 * stream. But flatMap() not only applies function but also flattens the stream
 * 
 * Flattening is referred by converting several lists of lists, and merge all
 * those lists to create single list containing all the elements from all the
 * lists. Before flattening : [[1, 2, 3], [4, 5], [6, 7, 8]] After flattening :
 * [1, 2, 3, 4, 5, 6, 7, 8]
 * 
 * INTERMEDIATE operation
 * 
 * @author Ankita
 *
 */
public class FlatMapExampe {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,3,5);
		List<Integer> list2 = Arrays.asList(2,4,6);
		List<Integer> list3 = Arrays.asList(8,9,10);
		
		List<List<Integer>> list = Arrays.asList(list1,list2, list3);
		
		System.out.println("Before flattening : "+list);
		
		List<Integer> listNew = list.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		
		System.out.println("After flattening : "+listNew);
		
	}
}
