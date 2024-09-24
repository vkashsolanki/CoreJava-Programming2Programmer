package com;

import java.util.Arrays;

public class SoftDemo {

	public static void main(String[] args) {
	        int[] arr = { 32, 87, 3, 589, 12, 1076, 200, 8, 622, 127, 0,0,0,0,12,12,1,3,4,56,6 };
	        
	       //for sort() used 
//	        Arrays.sort(arr);
//	        for(int i = 0; i< arr.length; ++i) {
//	        	System.out.println(arr[i]);
//	        }
	        
	        
		
	// for without sort used
	  
	        for (int i = arr.length; --i >= 0; ) {
	            for (int j = 0; j < i; j++) {
	                if (arr[j] > arr[j+1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                 }
	             }
	         }
	  
	         for (int i = 0; i < arr.length; i++) {
	             System.out.print(arr[i] + " ");
	         }
	        // System.out.println();
	    }
}


