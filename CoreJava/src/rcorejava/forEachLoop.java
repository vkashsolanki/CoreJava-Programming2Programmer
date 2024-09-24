package rcorejava;

public class forEachLoop {
	public static void main(String[] args) {

		int i[] = { 2, 10 };
		int s = 0;
		for (int x : i) {

			// sum of array

			s = s + x;

		}
		System.out.println("sums of "+s);

	}
}
