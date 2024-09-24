package abstraction;

abstract public class Test {
	
	
	abstract void sum();
	
	public static void main(String[] args) {
		
		
		MyChild c = new MyChild();
		c.sum();
	}

}
