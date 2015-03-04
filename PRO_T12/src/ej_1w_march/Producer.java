package ej_1w_march;

import java.util.List;

public class Producer implements Runnable {
	List<String> list;

	public Producer(List<String> list) {
		this.list = list;
	}

	@Override
	public void run() {
		int count = 0;
		while (true) {
			if (count > 300000000) {
				count = 0;
			}
			if (list.size() < 10) {
				list.add("String number " + count);
				count++;
			}
			try {
				Thread.sleep((long)(Math.random()*1001+500));
			} catch (InterruptedException e) {

			}
		}

	}

}
