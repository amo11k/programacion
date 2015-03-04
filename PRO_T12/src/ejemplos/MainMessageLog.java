package ejemplos;

public class MainMessageLog  {

	public static void main(String[] args) throws InterruptedException {
		
		MessageLog mensaje= new MessageLog("edgar","es ","muy ","guapo");
		Thread thread= new Thread(mensaje);
		thread.start();

		long miliSec=Integer.parseInt(args[0])*1000;
		int acum=0;
		while (thread.isAlive()){
			Thread.sleep(1000);
			acum+=1000;
			if (acum>miliSec){
				thread.interrupt();
			}
		}
		System.out.println("the end");
	}

}
