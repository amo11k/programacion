package exercises;

import java.util.Scanner;

public class Extension {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your name.extension");
		String myString = keyboard.nextLine();
		String[] s = myString.split("\\.");
		System.out.println("File's extension is: "+"."+s[1]+"\n"+"The file's name is :"+s[0]);
	}

}
