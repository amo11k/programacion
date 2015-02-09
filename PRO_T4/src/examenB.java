//amo11k
import java.util.Scanner;
public class examenB {
	public static void main(String[]args){
		float ac=0;
		double pi;
		
				
		for (int i=0;i!=10000000;i++){
			if (i%2==0){
				ac=ac+1f/(2*i+1);
			}else{
				ac=ac-1f/(2*i+1);
			}
		}
		pi=4*ac;
		System.out.println("Pi is "+pi);
	}
}
