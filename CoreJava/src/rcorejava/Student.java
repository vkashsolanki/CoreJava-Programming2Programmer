package rcorejava;

import java.lang.ProcessHandle.Info;

public class Student {

	static int studentId;
	static String studentName;
	static String studentCity;

	static void study() {
		info();
		System.out.println("All Student Are Studying!...");
	}

	static void info() {
		
		System.out.println("Id: " + studentId + "Name : " + studentName + "City: " + studentCity);
	}

	public static void main(String[] args) {

		

		Student student = new Student();
		student.studentId = 450;
		student.studentName = "Ram";
		student.studentCity = "Delhi";
		student.study();

		//student.info();

	}

}
