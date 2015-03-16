package harnes;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Harness {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text, regex;
		boolean repeat = true;
		while (repeat) {
			System.out.format("%nEnter input string to search into: ");
			text = scan.nextLine();
			System.out.format("%nEnter your regex: ");
			regex = scan.nextLine();
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(text);
			boolean found = false;
			while (matcher.find()) {
				System.out.format("I found the text \"%s\" starting at "
						+ "index %d and ending at index %d.%n",
						matcher.group(), matcher.start(), matcher.end());
				found = true;
			}
			if (!found) {
				System.out.format("No match found.%n");
			}
		}
		scan.close();
	}
}
