//amo11k
import java.util.Arrays;
import java.util.Scanner;
public class Exercise2 {
	public static void main(String[]args){
		int n;
		int temp;
		int[] array=new int[10];
				
		for (int i=0;i<10;i++){
			Scanner input;
			input=new Scanner(System.in);
			System.out.println("Enter number");
			n=input.nextInt();
			array[i]=n;
		}for (int i=9;i>=(9+1)/2;i--){
			temp=array[i];
			array[i]=array[9-i];
			array[9-i]=temp;
			
		}for (int i=0;i<10;i++){
			System.out.print(array[i]+",");
		}
	}
}
