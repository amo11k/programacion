package ejer_player;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Queue<Player> queue = new PriorityQueue<>();
		Player p1 = new Player("Eric", 100);
		Player p2 = new Player("Amo11k", 185);
		Player p3 = new Player("Paco", 12);
		Player p4 = new Player("Francisc@", -21);
		Player p5 = new Player("Emo", -20);

		queue.add(p1);
		queue.add(p2);
		queue.add(p3);
		queue.add(p4);
		queue.add(p5);

		while (!queue.isEmpty()) {
			System.out.println(queue.remove().toString());
		}

	}

}
