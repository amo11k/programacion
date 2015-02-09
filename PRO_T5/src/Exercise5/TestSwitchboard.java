package Exercise5;
public class TestSwitchboard {

	public static void main(String[] args) {
		/*int proba=(int) (Math.random()*999999999);
		System.out.println(proba);
		Switchboard switchboard[]=new Switchboard[10];*/
		Switchboard calls[]=new Switchboard[100];
		for (int i=0;i<100;i++){
			int d=(int)(Math.random()*3);
			int a=(int)(Math.random()*99999999)+600000000;
			int b=(int)(Math.random()*99999999)+600000000;
			double c=(int)(Math.random()*200);
			calls[i]=new Switchboard(a,b,c,getRandomBoolean(),d);
			System.out.println(calls[i].toString());
		}
	
		/*int proba=(int)(Math.random()*3);
		System.out.println(proba);*/
		
		/*Examen Cómo devolver una array de algo
		  public "tipo elementos"[] getArray(){
		  return "elementos"*/
		
		
		
		
		
		
	}

	private static boolean getRandomBoolean() {
		return Math.random()<0.5;
	}
}
