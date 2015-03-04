package ejemplos;

public class CharPrinter  implements Runnable{
private char ch=0;
private long time=0;
public CharPrinter(char newCh, long newTime){
	ch=newCh;
	time=newTime;
}

public void run() {
	int counter =1;
	try {
		while(true){
			System.out.print(ch);


			Thread.sleep(time);

			if(counter==5){
				System.out.print("\n");
				counter=0;
			}
			counter++;
		}
	} catch (InterruptedException e) {
		System.out.println(" el caracter "+ch+" finalizo");
		return;
	}
}
}
