package generics;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		/*Box<String> b = new Box<String>();
		b.setObject("Hello");
		String s = b.getObject();
		System.out.println(s);*/

		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Hello", 8);
		Pair<String, Integer> p2 = new OrderedPair<String, Integer>("Hello", 8);
		System.out.println(Util.compare(p1, p2));
		
		
	}

}
