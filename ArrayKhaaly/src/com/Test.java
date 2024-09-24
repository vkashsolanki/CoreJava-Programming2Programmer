package com;

public class Test {
	
	//Find a peak element which is not smaller than its neighbours
	
	
	
	static int findElement(int a[], int n) {
		
		// First or last element is peak element
		if(n == 1) 
			return 0;
		if(a[0] >= a[1])
			return 0;
		if(a[n -1 ] >= a[n -2])
			return n - 1;
		 // Check for every other element
		for(int i=1; i < n-1; i++) {
			 // Check if the neighbors are smaller	
			if(a[i] >= a[i - 1] && a[i] >= a[i + 1])
				return i;
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		
		int a[] = {1,2,45,78,98,45,12,78,36};
		int n = a.length;
		System.out.println(findElement(a, n));
		
		
	}
	

}
