package com;

class Salary {

	double da;
	double hra;
	double basicSalary;

	public void show1() {
		System.out.println("Eployee Salary ==>>" + da);
		System.out.println("Employee Salary ===>>" + hra);
		System.out.println("Employee Salary ==>>" + basicSalary);
	}

	public Salary(double da, double hra, double basicSalary) {
	
		this.da = da;
		this.hra = hra;
		this.basicSalary = basicSalary;
		show1();
	}

}

class Address {

	String country;
	String state;
	String city;
	int pinCode;

	public void show2() {
		System.out.println("Employee Country Name ==>> " + country);
		System.out.println("Employe State Name ==>>" + state);
		System.out.println("Employeee City Name===>> " + city);
		System.out.println("Employee Pincode ===>>" + pinCode);
	}

	public Address(String country, String state, String city, int pinCode) {
		
		this.country = country;
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
		show2();
	}

}

public class Employee {

	String name;
	int age;

	void show(){
		System.out.println("Employee Name ==>> " + name);
		System.out.println("Employee Age ==>> " + age);

	}

	public Employee(String name, int age) {

		this.name = name;
		this.age = age;
		show();
	}

	public static void main(String[] args) {

		Employee e = new Employee("Shyam", 25);

		Salary s = new Salary(45.2, 12.40, 45.01);

		Address a = new Address("IND", "Bihar", "Gaya", 842101);

	}

}
