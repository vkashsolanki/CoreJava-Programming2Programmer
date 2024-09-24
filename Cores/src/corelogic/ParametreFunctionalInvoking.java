package corelogic;

import java.util.Scanner;

public class ParametreFunctionalInvoking {
	// assign value in uNmae variable

	static String uName = "paro123@gmail.com";
	static String uPassword = "paro123";

	public void login() {
		// take input form user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the user name ");
		// calling next mehod which has Scanner class
		String username = sc.next();
		System.out.println("Enter the pasword");
		String userpassword = sc.next();
		// using condition with user input username and paswrod with uName and uPassword
		if (username.equals(uName) && userpassword.equals(uPassword)) {

			System.out.println("Login Successfully !");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		} else {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Please try again incorrect username and password");

			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}

	}

	public String showDetails(String name, String password) {
		// show detail as string return
		uName = name;
		uPassword = password;
		System.out.println("All User Details Here !.........");
		return name + " " + password;
	}

	public static void main(String[] args) {
		// creating object
		ParametreFunctionalInvoking pfi = new ParametreFunctionalInvoking();
		// invoekd login() in pfi ref. variable
		pfi.login();
		// print and invoekd showdetail() method as parameter pass value
		System.out.println(pfi.showDetails(uName, uPassword));

	}

}
