package exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailValidator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your mail");
		String myString = keyboard.nextLine();
		Pattern pattern = Pattern.compile(".*\\@.*\\.\\com$");
		Matcher matcher = pattern.matcher(myString);
		if (!matcher.find()){
			System.out.println("Correct");
		}else{
			System.out.println("Error");
		}

	}

}
