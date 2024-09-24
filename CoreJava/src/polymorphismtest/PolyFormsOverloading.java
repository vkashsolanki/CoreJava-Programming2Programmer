package polymorphismtest;

public class PolyFormsOverloading {
	
	
	
	void read()
	{
	System.out.println("Student are reading ");	
	}
	
	
	//overloading - same name diffrent parameter
	void read(String name)
	{
	System.out.println("Student name is  "+name);	
	}
	public static void main(String[] args) {
		PolyFormsOverloading p = new PolyFormsOverloading();
		p.read("Vikash Solanki");
		
		
	}

}
