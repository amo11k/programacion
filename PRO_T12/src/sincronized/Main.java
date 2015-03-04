package sincronized;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		Thread t = new Thread(new MyRunnable(counter));
		Thread t2 = new Thread(new MyRunnable(counter));
		t.start();
		t2.start();
		t.join();
		t2.join();
		System.out.println("Final value:"+counter.value());
	}
}
