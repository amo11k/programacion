package exercises;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountVocals {

	private final static String FILENAME = "text.txt";

	public static void main(String[] args) throws IOException {
		BufferedReader inputStream = null;
		File inputFile = new File(FILENAME);
		int count = 0;

		try {
			inputStream = new BufferedReader(new FileReader(inputFile));
			String l;
			Pattern pattern = Pattern.compile("[aeiouáéíóú]", Pattern.CASE_INSENSITIVE);
			Matcher matcher;
			while ((l = inputStream.readLine()) != null) {
				matcher = pattern.matcher(l);
				while (matcher.find()) {
					count++;
				}
			}
			System.out.println("Vowels: "+count);
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}

	}

}
