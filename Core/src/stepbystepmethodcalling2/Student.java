package stepbystepmethodcalling2;

class Address {
	String country;
	String state;
	String city;
	int pinCode;

	{
		country = "INIDA";
		state = "Bihar";
		city = "Gaya";
		pinCode = 824201;

	}

}

class Program {
	String coursename;
	String subject;
	String duration;
	long rollNumber;
	double fees;

	{
		coursename = "MCA";
		subject = "Computer Science";
		duration = "3 Years";
		rollNumber = 45154124;
		fees = 4500000;
		// String psg = coursename+" "+subject+" "+duration+" "+rollNumber+" "+fees;
		// psg.toString();

	}

}

public class Student {

	int id;
	String name;
	Address s;
	Program p;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	{
		s = new Address();
		p = new Program();
	}

	void show() {
		System.out.println(" >>>" + id);
		System.out.println(" >>>" + name);
		System.out.println(" >>>" + p.coursename);
		System.out.println(" >>>" + p.subject);
		System.out.println(" >>>" + p.duration);
		System.out.println(" >>>" + p.rollNumber);
		System.out.println(" >>>" + p.fees);

		System.out.println(" >>>" + s.country);
		System.out.println(" >>>" + s.state);
		System.out.println(" >>>" + s.city);
		System.out.println(" >>>" + s.pinCode);

	}

	public static void main(String[] args) {

		Student e = new Student(1001, "Riyal");
		e.show();

	}

}
