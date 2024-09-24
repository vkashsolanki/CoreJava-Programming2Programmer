package interfaces;


	class Circle implements Shape {

		@Override
		public void show(int i) {
			System.out.println("Area Circle of ::" + Math.PI * i * i);
		}

		public static void main(String[] args) {
			
			Shape s = new Circle();
			s.show(2);

		}
	}


