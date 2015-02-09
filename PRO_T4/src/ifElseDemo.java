//amo11k
import java.util.Scanner;
public class ifElseDemo {
	public static void main(String[]args){
		
		int testScore;
		char grade;
		//Reading Value
		System.out.println("Enter you mark");
		Scanner input;
		input=new Scanner(System.in);
		testScore=input.nextInt();
		
		if (testScore>=90)
			grade='A';
		else
			if (testScore>=80)
				grade='B';
			else
				if (testScore>=70)
					grade='C';
				else
					if (testScore>=60)
						grade='D';
					else
						grade='F';
		System.out.println("Grade "+grade);
	}
}
