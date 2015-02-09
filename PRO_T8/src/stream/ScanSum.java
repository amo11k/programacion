package stream;

import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class ScanSum {

	public static void main(String[] args) throws IOException {
		Scanner s = null;
		double sum = 0;
		try {
			s = new Scanner(new BufferedReader(new FileReader("usnumbers.txt")));
			s.useLocale(new Locale("ES"));
			while (s.hasNext()) {
				if (s.hasNextDouble()) {
					sum += s.nextDouble();
				} else {
					s.next();
				}
			}
		} finally {
			s.close();
		}
		System.out.println(sum);

	}

}
