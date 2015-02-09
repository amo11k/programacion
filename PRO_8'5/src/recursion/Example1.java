package recursion;

public class Example1 {

	public static void main(String[] args) {
		myMethod(4);

	}
	
	private static void myMethod(int counter){
		if (counter==0)
			return;
		else{
			System.out.println(""+counter);
			myMethod(--counter);
		}
	}

}
