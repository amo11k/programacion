//amo11k
public class ArrayDemo4 {
	public static void main(String[]args){
		int[][] anArray= new int[4][7];
		int cont=1;
		
		for (int i=0;i<4;i++)
			for (int j=0;j<7;j++){
				anArray[i][j]=cont;
				cont++;
			}
		for (int i=0; i<4;i++)
			for(int j=0;j<7;j++){
				System.out.println("Element at index "+i+","+j+":"+anArray[i][j]);
			}
	}
}