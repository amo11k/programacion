package DNI;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		char[] letra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
				'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		Scanner inputValue = new Scanner(System.in);
		int dni;
		System.out.println("Enter a DNI:");
		dni = inputValue.nextInt();
		System.out.println("The letter is: " + letra[dni % 23]);
	}

}
