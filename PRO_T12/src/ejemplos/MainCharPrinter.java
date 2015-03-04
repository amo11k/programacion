package ejemplos;

import java.util.ArrayList;
import java.util.List;


public class MainCharPrinter {
	public static void LaunchThead(List<Runnable> list) throws InterruptedException{
		List<Thread> thread = new ArrayList<Thread>();
		for(Runnable r: list){
			Thread t= new Thread(r);
			t.start();
			thread.add(t);
		}
		for(Thread ru:thread){
			long  time=(long) (Math.random()*1001+2000);
			Thread.sleep(time);
			ru.interrupt();
		}
	
	}
	
	public static void main(String[] args) throws InterruptedException {
	List<Runnable> list = new ArrayList<Runnable>();
	for(char c='a'; c<='z'; c++){
	long time=(long) Math.random()*3001+3000;
		CharPrinter a = new CharPrinter(c,time);
		list.add(a);
	}
	LaunchThead(list);
	}

}
