//amo11k
import java.util.Scanner;
public class Exercise1 {
	public static void main(String[]args){
		int n;
		int[] arrayNumbers;
		arrayNumbers=new int[10];
		
		for (int i=0;i<10;i++){
			Scanner input;
			input=new Scanner(System.in);
			System.out.println("Enter number");
			n=input.nextInt();
			arrayNumbers[i]=n;
		}for (int i=9;i>=0;i--){
			System.out.println(arrayNumbers[i]);
		}
	}
}
