package ej_1w_march;

import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		List<String> list = new Vector<String>();

		Runnable producerRunnable = new Producer(list);
		Thread producerThread = new Thread(producerRunnable);
		
		Runnable consumerRunnable = new Consumer(list);
		Thread consumerThread =new Thread(consumerRunnable);
		
		producerThread.start();
		consumerThread.start();
	}

}
