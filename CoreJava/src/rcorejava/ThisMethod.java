package rcorejava;

public class ThisMethod {
	

		int id;
		String name, city;
		
		ThisMethod()
		{
			this(12,"Ram", "Delhi");
		}

		public ThisMethod(int i, String n, String c) {
			this.id = i;
			this.name = n;
			this.city = c;
			System.out.println(id+" "+name+" "+city);
		}

		public static void main(String[] args) {

			ThisMethod tk = new ThisMethod();
		}

	}



