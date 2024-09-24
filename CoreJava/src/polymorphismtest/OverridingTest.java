package polymorphismtest;

public class OverridingTest {
	
	
	void show()
	{
		System.out.println("Basiic detail are here !!.");
	}
	
	
	

}


class Test  extends OverridingTest{
	
	void show() {
		
		System.out.println("detail for child class ");
	}
	
	
}


class Mainss{
	
public static void main(String[] args) {
		
	OverridingTest t = new Test();
	t.show();
		 
	}
}
