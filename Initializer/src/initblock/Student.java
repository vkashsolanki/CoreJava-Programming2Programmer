package initblock;

public class Student {
	
	
	int age;
	String name;
	
	public Student() {
	System.out.println("Default  const...........");	// TODO Auto-generated constructor stub
	}
	
	{
		age=12;
		name="ram";	
		System.out.println(name);
		System.out.println(age);
	}
	
//	void showInfo()
//	{
//		System.out.println(name);
//		System.out.println(age);
//	}
//	

	
	public static void main(String[] args) {
		
		Student s= new Student();
		//s.showInfo();
		
	}
}
