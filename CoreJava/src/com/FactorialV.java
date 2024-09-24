package com;

import java.util.Scanner;

public class FactorialV {
	
	
	
	public static void main(String[] args) {
		
		int fact=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positive integer");
		int num = sc.nextInt();
		
		
		for (int i = 1; i <= num; i++) {
			
			fact *=i;
		}
		System.out.println("factorail   "+fact);
	}

}
