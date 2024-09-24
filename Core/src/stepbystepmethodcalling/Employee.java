package stepbystepmethodcalling;

public class Employee {
	

		String name;
		int age;
		Salary s;
	        Address ad;


	               {
	 
			  s=new Salary();
			  ad=new Address();
		 
	              }
		
		Employee(String n,int a)
		{
	         name=n;
	         age=a;
		}

		void showDetails()
		{
		System.out.println("Detail of an employee is:");
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Salary is "+s.sa);
		System.out.println("Address is "+ad.add);

		}
		
		public static void main(String args[])
		{
			Employee emp=new Employee("ram",34);
			emp.showDetails();
		System.out.println(emp.s.ta); //OGNL
		System.out.println(Thread.currentThread().getName());




		}
	}
	class Salary
	{
	int ta,da,hra,sa;
		 
	{
	ta=20000;
	da=20000;
	hra=20000;
	sa=ta+da+hra;	
	}

	}
	class Address
	{
	String country,city,town,add,pincode;
	       
	        {
		country="India";
		city = "Delhi";
		town = "Model Town";
		pincode="31001";
		add=country+","+city+","+town+","+pincode;
		}

	}


