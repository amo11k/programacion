package ejemplos;


public class MyClass{

	public static void main(String[] args) {
		MyClass c = new MyClass();
		new Thread(new Runnable(){ //EJEMPLO DE CLASE ANONIMA
			
			
			@Override
			public void run() {
				for (int i=0;i<100;i++){
					System.out.println("MyThread: "+i);
				}
			}
		}).start();	
		for (int i=0; i<100; i++) {	
			System.out.println("main: "+i);	
		}
	}
}
