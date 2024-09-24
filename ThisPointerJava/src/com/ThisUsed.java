package com;

public class ThisUsed {

	int x = 45;

	void show(int x) {
		System.out.println(this.x);
		System.out.println(this.x=x);
		

	}

	public static void main(String[] args) {

		ThisUsed l = new ThisUsed();
		l.show(12);

	}

}
