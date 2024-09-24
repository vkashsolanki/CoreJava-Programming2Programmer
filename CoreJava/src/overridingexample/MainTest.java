package overridingexample;

public class MainTest {
	
	
	public static void main(String[] args) {
		//child class type create object for overriding runtime 
		Employee e = new Shyam();
		e.show();
		
		
		
		Ram r = new Ram();
		r.dowork(e);
	}

}
