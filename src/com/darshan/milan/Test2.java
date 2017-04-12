package com.darshan.milan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {

		String[] input = { "car", "cheating", "dale", "deal", "lead", "teaching", "silent", "listen" };
		
		int size = input.length; 
		String[] sortedInput = new String[size];
		
		/** 
		 * Above Code take the Size of the input and create the new Array Name sortedInput
		 * @author Darshan
		 * */
		
		for (int i = 0; i < size; i++) {
			String inputI = input[i];
			char[] temArr = inputI.toCharArray();
			Arrays.sort(temArr);
			String temp = new String(temArr);
			sortedInput[i] = temp;
		}
		
		/**
		 * Above code take the input and convert them in the Character Array and Sorted Array stored in sortedInput[] Array
		 * @author Darshan
		 * */

		Map<String, String> output = new HashMap<>();
		for (int i = 0; i < size; i++) {
			String temp = sortedInput[i];
			String outputStr = "";
			for (int j = i + 1; j < size; j++) {
				if (temp.equals(sortedInput[j]) && !output.containsKey(sortedInput[i])) {
					if (outputStr == "")
						outputStr = input[i];

					outputStr = outputStr + ", " + input[j];
				}

			}

			if (outputStr != "")
				output.put(sortedInput[i], outputStr);
		}
		System.out.println(output);
	}
	
	/**
	 * * Above Code is the main Importent in the code that code contains business logic
	 * First we create the Hashmap to Store the output
	 * I's loop take the First elements in the sorted Array and by J's loop it compare's each elements in that array
	 * First IF Condition Check if the Elements of I is matches to the elements of the J and take the key of the matched elements
	 * Second IF condition check if outputStr is null then we put the input of I and the append the same result with the input of J aswell
	 * And if outputStr is not null then we simply put the SortedInput[i]'s element as Key and outputStr as Value
	 * 
	 *  And Final just print the HashMap output over there.
	 * 
	 * @author Darshan
	 */
	 
	 * 
	 * /

