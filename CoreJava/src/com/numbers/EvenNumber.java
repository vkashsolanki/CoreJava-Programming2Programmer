package com.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> as = Arrays.asList(45,78,98,88,55,66,45);
		
		List<Integer> s = as.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		
				//even print
				for(int num : s) {
					System.out.println(num+"Even number");
				}
				
				List<Integer> s1 = as.stream().filter(number -> number % 2 != 0).collect(Collectors.toList());
				
				//even print
				for(int number : s1) {
					System.out.println(number+"ODD number");
				}
		
		
	}
	

}
