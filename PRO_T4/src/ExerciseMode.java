//AMO11k
public class ExerciseMode {
	public static void main(String[]args){
		char[] array={'c','b','a','a','a','b','b','b','b','b','c','b','c','b','a','b','b','a','a','a'};
		int temp;
		int x=0;
		int cont=0;
		char mode='g';
		//MODE
		for (int i=0;i<array.length;i++){
			cont=0;
			for(int j=0;j<array.length;j++){
				if (array[i]==array[j]){
					cont++;
				}
			}
			if (cont>x){
				mode=array[i];
				x=cont;
			}
		}
		System.out.print(mode+","+cont);
	}
}
