package com.practice;

/*Write a program to read words from a file. Count the 
repeated or duplicated words. Sort it by maximum repeated or
duplicated word count*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RepeatedWords {
	public static void main(String[] args) throws IOException {
		try {
			FileReader fileReader = new FileReader("I:/CODING/workspace/PracticeExampes/testFile");
			BufferedReader br = new BufferedReader(fileReader);
			String str;
			// String i;
			Map<String, Integer> map = new HashMap<String, Integer>();
			while ((str = br.readLine()) != null) {
				String[] tokens = str.split(" ");
				for (String word : tokens) {
					if (map.containsKey(word)) {
						int value = map.get(word);
						value = value + 1;
						map.put(word, value);
					} else {
						map.put(word, 1);
					}
				}
			}
			System.out.println(map);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
