package rcorejava;

class StudentConstructor {
	int sid;
	String sname;
	String scity;

	public StudentConstructor() {
		System.out.println("Creating Object now");
	}

	public StudentConstructor(int i, String n, String c) {
		System.out.println("Creating Object parameterized");
		sid = i;
		sname = n;
		scity = c;

	}

	void show() {
		System.out.println(sid + " " + sname + " " + scity);
	}

	public static void main(String[] args) {

		StudentConstructor s = new StudentConstructor(110, "Rama", "Ayodhya");
		s.show();
		// StudentConstructor s1 = new StudentConstructor();

	}

}
