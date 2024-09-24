package com;

public class UsingLoopSwaping {

	public static void main(String[] args) {

		int arr[] = { 02, 95, 12, 56, 63 };

		// Outer loop
		for (int i = 0; i < arr.length; i++) {
			// Inner nested loop pointing 1 index ahead
			for (int j = i + 1; j < arr.length; j++) {
				// checking element
				int temp = 0;
				if (arr[j] < arr[i]) {
					// swapping
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			System.out.println(arr[i]+" ");
		}

	}
}
