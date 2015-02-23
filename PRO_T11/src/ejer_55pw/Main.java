package ejer_55pw;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		String[] array = new String[] { "c", "a", "b" };
		shuffleArray(array);
		for (String s : array)
			System.out.print(s + " ");
		
		sortFile("prueba.txt");
		System.out.println("DONE");
		
		

	}

	public static void sortArray(String[] array) {
		List<String> result = Arrays.asList(array);
		Collections.sort(result);
		result.toArray(array);

	}

	public static void shuffleArray(String[] array) {
		List<String> result = Arrays.asList(array);
		Collections.shuffle(result);
		result.toArray(array);
	}

	public static void sortFile(String filename) throws IOException {
		File original= new File(filename);
		File tmp= new File("tmp");
		List<String> result = new ArrayList<>();
		BufferedReader in = new BufferedReader(new FileReader(filename));
		PrintWriter out = new PrintWriter(new FileWriter(tmp));

		try {
			String line;
			while ((line = in.readLine()) != null) {
				result.add(line);
			}
			Collections.sort(result);

			for (String s : result)
				out.println(s);
		} finally {
			in.close();
			out.close();
			original.delete();
			tmp.renameTo(original);
			
			
		}
	}
}
