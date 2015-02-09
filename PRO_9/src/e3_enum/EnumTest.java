package e3_enum;

public class EnumTest {

	public static void main(String[] args) {

		EnumTest proba = new EnumTest(Month.abril);
	}

	public enum Month {
		enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre
	}

	Month mes;

	public EnumTest(Month month) {
		this.mes = month;
	}

	public void tellMonth() {
		switch (mes) {
		case enero:
			System.out.println("Enero");
		case febrero:
			System.out.println("Febrero");
		case marzo:
			System.out.println("Marzo");
		case abril:
			System.out.println("Abril");
		case mayo:
			System.out.println("Mayo");
		case junio:
			System.out.println("Junio");
		case julio:
			System.out.println("Julio");
		case agosto:
			System.out.println("Agosto");
		case septiembre:
			System.out.println("Setiembre");
		case octubre:
			System.out.println("Octubre");
		case noviembre:
			System.out.println("Noviembre");
		case diciembre:
			System.out.println("Diciember");
		}
	}

}
