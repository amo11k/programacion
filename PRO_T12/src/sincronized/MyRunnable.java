package sincronized;

public class MyRunnable implements Runnable{
	Counter counter;
	
	public MyRunnable(Counter counter){
		this.counter=counter;
	}

	@Override
	public void run() {
		for (int i = 0; i<100000; i++) {
			synchronized(counter){  //manera 2
				counter.increment();
			}
			
		}		
	}
}
