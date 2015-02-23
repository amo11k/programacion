package hashet;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();

		set.add(4);
		set.add(5);
		set.add(2);
		set.add(2);
		set.add(5);

		System.out.println(set);
		System.out.println(Main.hashSetPlus(set));

		String[] listS = new String[] { "abc", "def", "ghi", "abc","abc" };
		printStrings(listS);
		System.out.println();
		printDuplicated(listS);
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		System.out.println(interseccion(set1, set2));

	}

	public static HashSet<Integer> hashSetPlus(HashSet<Integer> set) {
		HashSet<Integer> result = new HashSet<Integer>();
		for (Integer i : set) {
			result.add(i + 1);
		}
		/*
		 * WITH ITERATOR
		 * 
		 * Iterator<Integer> iterator= set.iterator(); 
		 * while (iterator.hasnext()){ 
		 * result.add(iterator.next()+1);
		 */
		return result;
	}

	public static void printStrings(String[] arraySt) {
		List<String> list = Arrays.asList(arraySt);
		HashSet<String> result = new HashSet<>(list);

		for (String s : result) {
			System.out.print(s + "  ");
		}
	}

	public static void printDuplicated(String[] arraySt) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arraySt));
		HashSet<String> remove = new HashSet<>(list);

		for (String s : remove) {
			list.remove(s);
		}
		System.out.println(new HashSet<String>(list));
	}
	
	public static <T> Set<T> interseccion(Set<T> set1, Set<T> set2){
		Set<T> result = new HashSet<T>(set1);
		result.retainAll(set2);
		return result;
	}

}
