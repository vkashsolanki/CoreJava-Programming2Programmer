package defaultconstructor;

public class Student {
	
	int age;
	String name;
	
	Student()
	{
		System.out.println("Default constructor.......");
		age=10;
		name="Komal";
	}
	
	void show() {
		System.out.println(age);
		System.out.println(name);
	
	}
	
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.show();
	}

}
