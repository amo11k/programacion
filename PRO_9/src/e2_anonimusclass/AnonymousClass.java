package e2_anonimusclass;

public class AnonymousClass {

	public static void main(String[] args) {

	}

	public AnonymousClass() {

	}

	interface Calculadora {
		public double sumar(int x, int y);

		public double restar(int x, int y);
	}

	public void test() {
		Calculadora a = new Calculadora() {
			public double sumar(int x, int y) {
				return x + y;
			}

			public double restar(int x, int y) {
				return x - y;
			}
		};
		a.sumar(5, 8);
		a.restar(4, 5);
	}

}
