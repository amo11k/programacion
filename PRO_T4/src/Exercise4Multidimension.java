//amo11k
import java.util.Arrays;
public class Exercise4Multidimension {
	public static void main(String[]args){
		int[][] arrayMulti;
		arrayMulti=new int[10][10];
		
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				arrayMulti[i][j]=0;
			}
		}
		arrayMulti[0][4]=1;
		arrayMulti[2][6]=1;
		arrayMulti[3][1]=1; 
		arrayMulti[8][6]=1;
		
		for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
				System.out.print(arrayMulti[i][j]);
			}
			System.out.println("");
		}
	}
}
