package E1_localClass;

public class LocalClass {
	public int x = 1;
	public int y = 2;

	public LocalClass() {

	}

	public int test() {
		class Suma {
			private int result;
			private int x = 4;
			private int y = 5;

			public Suma() {
				int x = 2;
				int y = 4;
				result = LocalClass.this.x + LocalClass.this.y + x + y + this.x
						+ this.y;
			}

			public int getResult() {
				return result;
			}
		}
		Suma s = new Suma();
		System.out.println(s.getResult());
		return s.getResult();

	}
}
