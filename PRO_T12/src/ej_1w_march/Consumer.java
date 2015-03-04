package ej_1w_march;

import java.util.List;

public class Consumer implements Runnable {
	List<String> list;

	public Consumer(List<String> list) {
		this.list = list;
	}

	@Override
	public void run() {
		try {
			while (true) {
				if (!list.isEmpty()) {
					String s = list.get(0);
					list.remove(0);
					System.out.println(s+"("+list.size()+" remaining)");
					
				}
				Thread.sleep((long)(Math.random()*1001+1000));
			}
		} catch (InterruptedException e) {
			
		}
	}
}
