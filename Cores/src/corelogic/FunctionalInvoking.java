package corelogic;

import java.util.Scanner;

public class FunctionalInvoking {
	// solanki123@gmail.com ko userName ke variable me assign ki hai
	String userName = "solanki123@gmail.com";
	// solanki123 ko password name ka vriable me addign ki hai
	String password = "solanki123";

	public void login() {

		// taku input form user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your user name");
		String name = sc.nextLine();
		System.out.println("Etner you pasword");
		String pass = sc.next();

		if (name.equals(userName) && pass.equals(password)) {
			System.out.println("Successfully login !");
		} else {
			System.out.println("Please provide user name and pasword is coorect!");

		}

	}

	public static void main(String[] args) {

		FunctionalInvoking n = new FunctionalInvoking();
		n.login();
	}

}
