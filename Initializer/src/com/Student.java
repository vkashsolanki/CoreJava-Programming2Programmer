package com;

public class Student {
	 String name;
	 int age;
	
	void doIt()
	{
		System.out.println(name);
		System.out.println(age);
		
	}
	public static void main(String[] args) {
		Student s= new Student();
		s.doIt();
		
	}
	

}
