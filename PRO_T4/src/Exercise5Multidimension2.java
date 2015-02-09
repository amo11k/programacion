//amo11k
import java.util.Arrays;
public class Exercise5Multidimension2 {
	public static void main(String[]args){
		int row=0;
		int col=0;
		boolean cero;
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
			cero=true;
			for (int j=0;j<10;j++){
				if (arrayMulti[i][j]==1){
					cero=false;
					break;
				}				
			}
			if (cero)
				row++;
		}
		for (int j=0;j<10;j++){
			cero=true;		
			for(int i=0;i<10;i++){
				if (arrayMulti[i][j]==1){
					cero=false;
					break;
				}
			}
			if (cero)
				col++;
		
		}
		System.out.println(row+","+col);
	}
}
