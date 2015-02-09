//amo11k
import java.util.Scanner;
public class BreakDemo {
	public static void main(String[]args){
		boolean prime=true;
		int n;
		
		//Reading value
		Scanner input;
		input=new Scanner(System.in);
		n=input.nextInt();
		
		for (int i=2; i<n; i++){
			if (n%i==0){
				prime=false;
				break;
			}
		}
		if (prime)
			System.out.println("Prime");
		else
			System.out.println("NOT prime");
		}
	}

