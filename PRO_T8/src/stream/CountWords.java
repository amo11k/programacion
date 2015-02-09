package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) throws IOException {
		Scanner s = null;
		int count= 0; 
		try {
			s = new Scanner(new BufferedReader(new FileReader(args[0])));
			while (s.hasNext()) {
				count++;
				s.next();
			}
			System.out.println(count);
			
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}
}
