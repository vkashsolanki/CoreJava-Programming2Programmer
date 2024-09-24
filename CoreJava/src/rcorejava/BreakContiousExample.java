package rcorejava;

public class BreakContiousExample {
	
	public static void main(String[] args) {
		
		for(int i=10; i<=100; i++)
		{
			System.out.println(i);
			if(i==50) {
				break;
			}
		}
	}

}
