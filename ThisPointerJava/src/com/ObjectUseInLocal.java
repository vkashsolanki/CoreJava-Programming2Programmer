package com;

public class ObjectUseInLocal {

	String name = "Ram";

	void show(ObjectUseInLocal l) {
		System.out.println(l.name);
		System.out.println(l);

	}

	public static void main(String[] args) {
		ObjectUseInLocal s = new ObjectUseInLocal();
		s.show(s);

	}
}
