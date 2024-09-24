package com.user;

import java.util.Scanner;

public class UserMenu {

	public static void main(String[] args) {

		String input = "";

		Scanner sc = new Scanner(System.in);

		// user input

		while (input != "5") {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Enter 1 for adding book");
			System.out.println("Enter 2 for adding member");
			System.out.println("Enter 3 for issuing book");
			System.out.println("Enter 4 for returning a book");
			System.out.println("Enter 5 for Exit !..... Happy Coding Welcome");
			input = processUserInput(sc.nextLine().toString());
		}
	}

	public static String processUserInput(String in) {

		String retValue = "5";

		switch (in) {
		case "1":
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			// caling addbookmenu method
			AddBookMenu.addBookMenu();
			
			System.out.println("You have selected option 1 to add book");
			return "1";

		case "2":
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			AddMemberMenu.addMemmberMenu();
			System.out.println("You are selected option 2 to add member");
			
			return "2";

		case "3":
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("You are selected option 3 to issue a book");
			LibFunction.callIssueMenu();
			return "3";

		case "4":
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("You are selected option 4 to return a book");
			LibFunction.callReturnMenu();
			return "4";
		
		
		default:
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Exit  !!!.........Thanks for working on this!!");
			return "5";
		}
		
	}

}
