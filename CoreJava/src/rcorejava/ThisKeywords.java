package rcorejava;

public class ThisKeywords {

	int id;
	String name, city;

	public ThisKeywords(int i, String n, String c) {
		this.id = i;
		this.name = n;
		this.city = c;
		System.out.println(id+" "+name+" "+city);
	}

	public static void main(String[] args) {

		ThisKeywords tk = new ThisKeywords(100, "lala", "Noida");
	}

}
