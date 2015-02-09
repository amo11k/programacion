//amo11k
import java.util.Scanner;
public class ExerciseDNI {
	public static void main(String[]args){
		int dni,n;
		char[] array={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		//Reading DNI
		Scanner input;
		input=new Scanner(System.in);
		System.out.println("Introduce tu DNI");
		dni=input.nextInt();
		
		//Operation
		n=dni%23;
		System.out.println("Tu letra es: "+array[n]);
		
	}	
}
