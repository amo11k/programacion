//amo11k
import java.util.Scanner;
public class examenC {
	public static void main(String[]args){
		int i,c,n;
		
		//Reading value
		Scanner input=new Scanner(System.in);
		System.out.println("Enter n");
		n=input.nextInt();
		
		//Loop
		for (i=1;i!=n;i++){
			c=1;
			System.out.println(i);
			for (c=1;c<=i;c++){
				System.out.print(c+",");
			}
		}
	}
		
}
