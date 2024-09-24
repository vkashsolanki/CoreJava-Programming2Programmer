package com;

import java.util.Scanner;

public class DeterminerOldestYoungest {

	// Ques3:-Take input of age of 3 people by user and determine oldest and
	// youngest among them.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("First Person ==>>");
		int personAge1 = sc.nextInt();
		System.out.println("Second Person ==>>");
		int personAge2 = sc.nextInt();
		System.out.println("Third Person ==>>");
		int personAge3 = sc.nextInt();

		if (personAge1 < personAge2 && personAge1 < personAge3) {
			System.out.println("First Person is Youngest");
		} else if (personAge2 < personAge1 && personAge2 < personAge3) {
			System.out.println("Second Person Youngest");
		} else if (personAge3 < personAge1 && personAge3 < personAge2) {
			System.out.println("Third person youngest");
		} else {
			System.out.println("All Persong Same Age");
		}

		if (personAge1 > personAge2 && personAge1 > personAge3) {
			System.out.println("First Person is Oldest");
		} else if (personAge2 > personAge1 && personAge2 > personAge3) {
			System.out.println("Second Person Oldest");
		} else if (personAge3 > personAge1 && personAge3 > personAge2) {
			System.out.println("Third person Oldest");
		} else {
			System.out.println("All Persong Same Age");
		}
	}

}
