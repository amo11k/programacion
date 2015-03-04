package exercise1;

public class CounterThread implements Runnable{
	public static boolean done = false;
	public int num;
	public static final int MAXTENS=100000;
	
	public CounterThread(boolean done, int num){
		this.done=done;
		this.num=num;
	}
	@Override
	public void run() {
		int tens=0;
		while (done==false){
			int math = (int) (Math.random()*10+1);
			if (math==10)
				tens++;
			if(tens==MAXTENS)
				done=true;
		}
		if (tens==MAXTENS)
			System.out.println("The WINNER thread "+num+" got "+tens+" tens");
		else
			System.out.println("This thread "+num+" "+tens+" tens");
	}
	
	public static void main(String[] args) {
		
		Runnable r1, r2, r3, r4, r5, r6, r7, r8, r9, r10;
		Thread t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
		
		
		t1=new Thread(r1=new CounterThread(done,1));
		t2=new Thread(r2=new CounterThread(done,2));
		t3=new Thread(r3=new CounterThread(done,3));
		t4=new Thread(r4=new CounterThread(done,4));
		t5=new Thread(r5=new CounterThread(done,5));
		t6=new Thread(r6=new CounterThread(done,6));
		t7=new Thread(r7=new CounterThread(done,7));
		t8=new Thread(r8=new CounterThread(done,8));
		t9=new Thread(r9=new CounterThread(done,9));
		t10=new Thread(r10=new CounterThread(done,10));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();		
	}
}
