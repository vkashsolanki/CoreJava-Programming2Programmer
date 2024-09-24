package arrays;

import java.util.Iterator;

public class ArrayInitilizer {

	
	
	public static void main(String[] args) {
		
		int a[]; // array declations
		a= new int[]{1,45,78,45,45,8,54,45,4}; // initializer
		
		//System.out.println(a[2]);
		//set the value at 2 index position
		a[2]=100;
		a[0]=200;
		// traverse indexing
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	
	
	
}
