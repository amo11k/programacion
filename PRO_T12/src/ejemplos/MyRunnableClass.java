package ejemplos;

public class MyRunnableClass implements Runnable {
	public void run() {
		try{
			for (int i=0; i<200; i++) {
				System.out.println("MyThread: "+ i);
				Thread.sleep(1000);
			}
		}catch (InterruptedException ex){
			System.out.println("Thread interrupted");
			return;
		}
	}
}