package com.java8.stream;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;


/**
 * TERMINAL operation
 * 
 * @author Ankita
 *
 */
public class CollectExample {
	public static void main(String[] args) {
		
		//Converting Stream to List
		List<String> subjects = Arrays.asList("Maths", "SST", "History", "Scence", "HomeScience", "MicroBio", "Hindi",
				"Sanskrit");
		List<String> list1 = subjects.stream().filter(e -> e.startsWith("S")).collect(Collectors.toList());
		//System.out.println("Stream to list : "+list1);
		list1.forEach(System.out::println);
		
		//Converting Stream to Set
		Set<String> set1 = subjects.stream().filter(e -> e.startsWith("S")).collect(Collectors.toSet());
		System.out.println("Stream to Set : "+set1); //older way to print
		set1.forEach(System.out::println); ///one way to print
		set1.forEach(x -> System.out.println(x)); //other way to print
		
		//Converting Stream to Mapss
		Map<String, Integer> map1 = subjects.stream().filter(e -> e.startsWith("S")).collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println("Stream to Map : "+map1); 
		map1.entrySet().forEach(System.out::println); //printing entries
		map1.entrySet().forEach(x -> System.out.println(x)); //other way to print
		
		map1.keySet().forEach(System.out::println); //printing keys
		map1.keySet().forEach(x -> System.out.println(x)); //other way to print
		
		map1.values().forEach(System.out::println); //printing values
		map1.values().forEach(x -> System.out.println(x)); //other way to print
		
		//Joining strings
		String str1 = subjects.stream().collect(Collectors.joining());
		System.out.println("Joining Example : "+str1);
		
		//Joining strings with ","
		String str2 = subjects.stream().collect(Collectors.joining(", "));
	    System.out.println("Joining with , : "+str2);
	    
	  //Joining strings with "," , start with {, endwith }
	  	String str3 = subjects.stream().collect(Collectors.joining(", ","{ "," }"));
	  	System.out.println("Joining with \",\" , start with {, endwith } : "+str3);
		
		
	}
}
