package recursion;

public class FibonacciSerie {

	public static void main(String[] args) {
		System.out.println(sumatorio(1000));
		

	}
	private static int fibonacci(int num){
		if(num==1||num==2)
			return 1;
		else{
			return num = fibonacci(num-1)+fibonacci(num-2);
		}
	}
	
	private static int sumatorio(int num){
		if(num==1)
			return 1;
		else{
			return num+sumatorio(num-1);
		}
	}
}
