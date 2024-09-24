package com;

import java.util.Scanner;

public class Rectangles {
	
	//Take values of length and breath of a rectangle from user and check if it is square or not.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enther the your length  ==>>");
		int length = sc .nextInt();
		
		System.out.println("Enther the your breath  ==>>");
		int breath = sc .nextInt();
		
		int result = length*breath;
		
		if(length==breath) {
			System.out.println("Rectangle Square is ::>> "+result);
		}else
		{
			System.out.println("Not Rectangle ::==>>>");
		}
		
	}

}
