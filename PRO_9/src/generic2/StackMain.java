package generic2;

public class StackMain {

	public static void main(String[] args) throws EmptyListException {
		Stack a=new Stack();
		a.push("Papa arruga");
		a.push("Mañana vacaciones");
		a.push("1+1=7");
		a.print();
		String s = (String) (a.pop());
		a.print();
	}

}
