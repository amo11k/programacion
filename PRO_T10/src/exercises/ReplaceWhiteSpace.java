package exercises;

import java.util.Scanner;

public class ReplaceWhiteSpace {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your String");
		String myString = keyboard.nextLine();
		String result = myString.replaceAll("\\s|\\s{4}", "");
		System.out.println(result);
		

	}

}
