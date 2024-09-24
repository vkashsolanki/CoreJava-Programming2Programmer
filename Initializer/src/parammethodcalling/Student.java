package parammethodcalling;

public class Student {

	int age;
	String name;

	void add(int a, String n) {
		age = a;
		name = n;
		System.out.println(age);
		System.out.println(name);
	}

//	void show() {
//		System.out.println(age);
//		System.out.println(name);
//	}

	public static void main(String[] args) {
		Student s = new Student();
		s.add(10, "Mathura");
		//s.show();
	}

}
