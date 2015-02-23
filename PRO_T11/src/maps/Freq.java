package maps;

import java.util.*;

public class Freq {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] array = new String[]{"Hello", "World", "Hello", "Beach"};
		
		//Inicializa
		for (String s: array){
			Integer freq=map.get(s);
			map.put(s, (freq==null)? 1: freq+1);
		}
		
		System.out.println(map.size()+" distinc words");
		System.out.println(map);
	}

}
