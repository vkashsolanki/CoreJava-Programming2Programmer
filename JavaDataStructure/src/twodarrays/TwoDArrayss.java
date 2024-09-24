package twodarrays;

import java.util.Iterator;

public class TwoDArrayss {
	
	public static void main(String[] args) {
		
		int[][]  arr= new int[5][6];
		
		//set
		arr[3][1]=45;
		//get
		System.out.println(arr[3][1]);
		
		//traverse 2 d
		for(int i=0; i< arr.length; i++)
		{
			for(int j=0; j< arr.length; j++) {
				System.out.println(arr[i]);
				System.out.println(arr[j]);
			}
		}
		
		
	}

}
