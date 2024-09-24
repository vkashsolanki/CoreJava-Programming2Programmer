package com;

import java.util.Scanner;

public class GreatestNumber {

	// Ques2 :-take two int values from user and print greatest among them.

	// Ques3:-Take input of age of 3 people by user and determine oldest and
	// youngest among them.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numer  ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {

			System.out.println("Greather than number ::>> " + a);
		} else

			System.out.println("Lest than  number " + b);

	}

}
