package arraucore;

import java.util.Iterator;

public class ArrayTest {
	public static void main(String[] args) {
		
		int a[]; // array eclaration
		int[] arr;
		
		arr= new int[]{45,78,90};
		
		System.out.println(arr[2]);
		
		arr[2]=100;
		System.out.println(arr[2]);
		
		// how to travler  array using for loop
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
	}

}
