package exercises;

public class StringMatcher {
	
	// returns true if the string matches exactly "true"
	public static boolean isTrue(String s) {
		return s.matches("true");
	}

	// returns true if the string matches exactly "true" or "True"
	public static boolean isTrueV2(String s) {
		return s.matches("[tT]rue");
	}
	
	//A method that returns true if the text is “true”, “True”, “yes” or “Yes”
	public static boolean method1(String s){
		return s.matches("[tT]rue")|s.matches("[yY]es");
	}
	
	//A method that returns true if the string contains “true”
	public static boolean method2(String s) {
		return s.matches(".*true*.");
	}
	
	//3.- A method that returns true if the string contains just 3 letters (no digits).
	public static boolean method3(String s) {
		return s.matches("[a-zA-Z]{3}");
	}
	//A method that returns true if the string does not have a number at the beginning.
	public static boolean method4(String s) {
		return s.matches("[^0-9]*");
	}
	//A method that returns true if the string contains an arbitrary numbers of characters except b.
	public static boolean method5(String s) {
		return s.matches("[^b]*");
	}
	
	//A method that returns true if the string contains a number less than 300 (using regular expression).
	public static boolean method6(String s) {
		return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
	}
	
	//
	public static boolean method7(String s) {
		return s.matches("^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
	}
	
}
