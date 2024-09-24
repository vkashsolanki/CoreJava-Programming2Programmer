package staticblock;

public class Student {
	
	static int age;
	static String name;
	
	static {
		age=12;
		name="Ram";
		System.out.println(name);
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
		// not need to create object for static block 
	}
}
