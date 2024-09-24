package com;

import java.util.Scanner;

public class ReverseWhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting number");
		int startNumber = sc.nextInt();
		System.out.println("Enter the ending nuumber");
		int endNumber = sc.nextInt();

		while (startNumber>=endNumber) {
			System.out.println(startNumber);
			startNumber--;
		}
			
		

	}
}