package maps;

import java.io.*;
import java.util.*;

public class LastNameToCSV {

	public static void main(String[] args) throws IOException {
		File tmp = new File("LastnameFreqSORTED.csv");
		Map<String, Integer> map = new TreeMap<>();
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		PrintWriter out = new PrintWriter(new FileWriter(tmp));
		Scanner scan;

		String line;
		try {
			while ((line = in.readLine()) != null) {
				scan = new Scanner(line);
				scan.useDelimiter(",");
				map.put(scan.next(),
						Integer.valueOf(scan.next().replaceAll("\\.", "")));
			
			}
			Iterator<String> it = map.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				out.print(key+", "+map.get(key)+"\n");
			}
			System.out.println("DONE");
			
		} finally {
			in.close();
			out.close();
			
		}
	}

}
