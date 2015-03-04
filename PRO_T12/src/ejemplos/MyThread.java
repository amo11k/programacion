package ejemplos;

public class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("MyThread: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main: " + i);
			Thread.sleep(1000);
		}
	}
}
