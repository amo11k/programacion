package sincronized;

public class Counter {
	int c=0;
	
	public synchronized void increment(){ //manera1 
		c++;
	}
	
	public synchronized int value(){
		return c;
	}
}
