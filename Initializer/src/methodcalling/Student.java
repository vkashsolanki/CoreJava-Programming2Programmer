package methodcalling;

public class Student {

	int age;
	String name;

	void show() {
		age = 45;
		name = "radharadha";
	}

	void info() {
		System.out.println(age);
		System.out.println(name);

	}

	public static void main(String[] args) {

		Student s = new Student();
		s.show();
		s.info();

	}

}
