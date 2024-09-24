package com;

public class ThisPointerLearn {
	
	// (this) keyword is refrence variable of current class object
	
	int x=45;
	// s refer to l ThisPointerLearn class's object 
	void show(int t, ThisPointerLearn s) {
		System.out.println(s.x);
	}
	
	
	public static void main(String[] args) {
		
		
		ThisPointerLearn l = new ThisPointerLearn();
	
		l.show(12 , l);
		System.out.println(l);
		
		
		
	}

}
