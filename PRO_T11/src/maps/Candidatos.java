package maps;

import java.io.*;
import java.util.*;

public class Candidatos {

	public static void main(String[] args) throws IOException {
		Map<String, Integer> map = new HashMap<>();
		List<Pair> list = new ArrayList<>();
		BufferedReader in = new BufferedReader(new FileReader("Colfuturo-Seleccionados.csv"));

		String line;
		try {
			while ((line = in.readLine()) != null) {
				String[] fields = line.split(",");
				Integer freq = map.get(fields[6]);
				map.put(fields[6], (freq == null) ? 1 : freq + 1);
			}
			Set<String> keys = map.keySet();
			for (String s: keys){
				list.add(new Pair(s, map.get(s)));
			}
			Collections.sort(list);
			for (Pair s: list){
				System.out.println(s.toString());
			}
			
			
		} finally {
			in.close();
		}
	}
}
