package com;

public class Bulb {

	int watt;
	float price;
	String color;
	Boolean state;

	static int counter;
	static String cname;

	static {
		counter = 0;
		cname = "Surya";

	}

	{
		counter++;
	}

	Bulb() {
		watt = 220;
		price = 12.1f;
		color = "White";
		state = true;

	}

	public Bulb(int watt, float price, String color, Boolean state) {
		super();
		this.watt = watt;
		this.price = price;
		this.color = color;
		this.state = state;
	}
		
	void showDetail() {
		System.out.println("Company name of Bulb =>"+cname);
		System.out.println("Watt of Bulb =>"+watt);
		System.out.println("Price of Bulb =>"+price);
		System.out.println("Color of Buld =>"+color);
		System.out.println("State of Bulb =>"+state);
	}
	
	void changeState() {
		if(state==false) {
			state=true;
		}else {
				state=false;
			}
		}
	
	static void countBulb() {
		System.out.println("total number of bulb ==>> "+counter);
	}
	
	void changeCompanyName(String name) {
		this.cname=name;
	}
	
	
	public static void main(String[] args) {
		System.out.println("++++++++ Creating Same type ob Bulb ++++");
		Bulb b= new Bulb();
		b.countBulb();
		System.out.println("Show bulb 1");
		b.showDetail();
		Bulb b1= new Bulb();
		b1.countBulb();
		System.out.println("Show bulb 2");
		b1.showDetail();
		Bulb b2= new Bulb();
		b2.countBulb();
		System.out.println("Show bulb 3");
		b2.showDetail();
		
		System.out.println("++++++++++++++ Creating diffrent type of Bulb +++++");
		Bulb b4= new Bulb(12, 45.6f, "Blue", true);
		b4.showDetail();
		b4.countBulb();
		
		Bulb b5= new Bulb(16, 46.6f, "Red", true);
		b5.showDetail();
		b5.countBulb();

		Bulb b6= new Bulb(1456, 66.6f, "Green", true);
		b6.showDetail();
		b6.countBulb();

	}
	
	}
	

/*
Assigenment:-

Qus:-you have to create a class called "Bulb".In Bulb class you have to take the fallowing DataMember and MemberFunction:-

 
Properties:-
int watt;
float price;
String color;
boolean state;
int counter;
String cname;

Behaviour:-
void showDetails()
{}

void changeState()
{}

void countBulb()
{}

void changeCompanayName()
{}

Condation:-
1):-Here you have to decide that which data-member and member-function is static and which one is non-static.

2):-Suppose you are creating the Bulb for "SURYA" companay.

3):-Now it is my requirement that if we don't creating Bulb(Means don't creating the object of Bulb Class)so counter is initially assigned at loading time and if we call the countBulb method so it generet output that "o(zero) Bulb is created.."

4):-Now you have to create the 3 same type of Bulb.And printing the details of each Bulb separetly 

5):-If you create the 1st bulb object the counter is automatically invoked.And if you call the countBulb() method so it print total no of Bulb is 1 and if we create three Bulb object it print total no. of Bulb is 3. 

6):-Now you have to create the 3 different type of Bulb.And printing its details.Then countBulb() method is again called by you and it print the 
total no of Bulb is 6

7):-Now if suppose the Bulb have on(true) condation so you have the change the state of Bulb(if it is true so change is by false and if false so it change is to true) by calling ChangeState() method

8):-Now suppoose if we want the companay name so you have to call the ChangeCompany() method and change the company name of Bulb is "Philipse".



Note:-Addition attribute and functionally you may add.


Note:-After compliting the assignment you submit it on my id named:-

mailto:email:-suryaassigen@gmail.com

Mob:-9310683500 */



  

