package contructorcall;

public class Student {

	int age;
	String name;
	String gname;
	String address;
	int number;

	Student(String n, int a) {
		name = n;
		age = a;
		System.out.println(name);
		System.out.println(age);
		
	}

	Student(String n, int a, int number) {
		name = n;
		age = a;
		number = number;
		System.out.println(name);
		System.out.println(age);
		System.out.println(number);
			}

	Student(String n, int a, int number, String address) {
		name = n;
		age = a;
		number = number;
		address = address;
		System.out.println(name);
		System.out.println(age);
		System.out.println(number);
		System.out.println(address);
	}

	Student(String n, int a, String gname) {
		name = n;
		age = a;
		gname = gname;
		System.out.println(name);
		System.out.println(age);
		System.out.println(gname);
	}
	
//	void details() {
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(number);
//		System.out.println(gname);
//		System.out.println(address);
//	}
	

	public static void main(String[] args) {
		System.out.println("++++++++++++++++++++++++++++++++++");
		Student s = new Student("ram", 12);
		//s.details();
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		Student s1 = new Student("ram", 12, 4512412);
		//s1.details();
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		
		Student s2 = new Student("ram", 12, 7845745, "Patluka");
		//s2.details();
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		Student s3 = new Student("ram", 12, "Paro");
	 //	s3.details();

	}

}
