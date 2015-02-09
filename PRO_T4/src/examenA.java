//amo11k
import java.util.Scanner; 
public class examenA {
	public static void main(String[]args){
		int oven=0;
		int odd=0;
		int x;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter x");
		x=input.nextInt();
		
		while (x!=-1){
			if (x%2==0){
				oven++;
			}else{
				odd++;
			}
			System.out.println("Enter x");
			x=input.nextInt();
		}		
		if (oven>odd){
			if ((oven>0)&&(odd>0)){
				System.out.println("There are more oven than odd numbers");
				System.out.println("There are one or more oven numbers");
				System.out.println("There are one or more odd numbers");
			}else{
				System.out.println("There are more oven than odd numbers");
				System.out.println("There are one or more oven numbers");
				System.out.println("There are no odd numbers");
			}
		}else{
			if ((odd>0)&&(oven>0)){
				System.out.println("There are more odd than odd numbers");
				System.out.println("There are one or more oven numbers");
				System.out.println("There are one or more odd numbers");
			}else{
				System.out.println("There are more oven than odd numbers");
				System.out.println("There are one or more odd numbers");
				System.out.println("There are no oven numbers");
			}
		}
	}
}
