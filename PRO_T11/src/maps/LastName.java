package maps;

import java.io.*;
import java.util.*;

public class LastName {

	public static void main(String[] args) throws IOException {

		Map<String, Integer> map = new HashMap<>();
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		Scanner scan;

		String line;
		while ((line = in.readLine()) != null) {
			scan = new Scanner(line);
			scan.useDelimiter(",");
			map.put(scan.next(),
					Integer.valueOf(scan.next().replaceAll("\\.", "")));
		}
		System.out.println(map.get("ALONSO"));
	}

}
