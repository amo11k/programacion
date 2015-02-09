//AMO11k
public class ExerciseFolk {
	public static void main(String[]args){
		char x;
		char temp;
		char[] array={'3','2','1','7','8','0','9','6','4','5'};
		
		//SHORTING
		for (int i=0;i<array.length-1;i++){
			x=array[i];
			for (int j=i+1;j<array.length;j++){
				if (x>array[j]){
					temp=array[j];
					array[j]=x;
					x=temp;
				}
			}
			array[i]=x;
		}
		for (int i=0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
	}
}