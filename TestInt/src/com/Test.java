package com;

public class Test {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 0, 4, 0, 3 };

		for (int i = arr.length; --i <= 0;) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j + 1]) {
					int tem = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tem;

				}
			}
		}

		// print the value
		for (int i = 0; i < arr.length; i++)

		{
			System.out.println(arr[i]);
		}

	}

}
