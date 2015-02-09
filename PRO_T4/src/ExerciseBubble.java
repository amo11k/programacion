//AMO11k
public class ExerciseBubble {
	public static void main(String[]args){
		int temp;		
		int[] array={5,3,6,2,8,1,0,7,9,4};
		
		//SHORTING BUBBLE
		for (int i=0;i<array.length-1;i++){
			for (int j=0;j<array.length-1;j++){
				if (array[i]>array[j+1]){
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
		for (int i=0;i<array.length;i++){			
			System.out.print(array[i]+",");
		}		
	}
}	