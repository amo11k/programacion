package unit6_exercises_pattern;

public class PrintPatterns {

	public static void main(String[] args) {
		PrintPatterns.printPatternP(9);

	}
	public static void printPatternA(int size){
		for(int i=0;i<size;i++){
			for(int j=0;j<=i;j++){
					System.out.print("# ");					
			}
			System.out.println("");
		}
	}
	public static void printPatternB(int size){
		for(int i=0;i<size;i++){
			for(int j=0;j<size-i;j++){
					System.out.print("# ");					
			}
		System.out.println("");
		}
	}
	public static void printPatternC(int size){
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(j<i){
					System.out.print("  ");
				}else{
					System.out.print("# ");
				}
			}
		System.out.println("");
		}
	}
	public static void printPatternD(int size){
		for(int i=0;i<size;i++){
			for(int j=1;j<=size;j++){
				if(j>=(size-i)){
					System.out.print("# ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	public static void printPatternE(int size){
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if (i==0||i==size-1||j==0||j==size-1){
					System.out.print("# ");
				}else{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
	public static void printPatternF(int size){
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(i==0||i==j||i==size-1){
					System.out.print("# ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void printPatternG(int size){
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(i==0||j==(size-1)-i||i==size-1){
					System.out.print("# ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void printPatternH(int size){
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(i==0||j==(size-1)-i||i==j||i==size-1){
					System.out.print("# ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void printPatternI(int size){
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(i==0||j==(size-1)-i||i==j||j==0||j==size-1||i==size-1){
					System.out.print("# ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void printPatternJ(int size){
		for(int i=0;i<size;i++){
			for(int j=0;j<size-i;j++){
				if(i==0||(i==size&&j==size)||(i<=j&&i<size)){
					System.out.print("# ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void printPatternK(int size){
		for(int i=0;i<size;i++) {
	         for(int j=0;j<size-i;j++) {
	             System.out.print("  ");
	         }
	        for(int k=0;k<i*2+1;k++) {
	            System.out.print("# ");
	        }
	        System.out.println();  
	    }
	}
	public static void printPatternL(int size){
		for (int i = 1; i <= size; i++){
              for (int j = 0; j < (size - i); j++)
                    System.out.print("  ");
              for (int j = 1; j <= i; j++)
                    System.out.print("# ");
              for (int k = 1; k < i; k++)
                    System.out.print("# ");
              System.out.println();
        }
        for (int i = size - 1; i >= 1; i--){
              for (int j = 0; j < (size - i); j++)
                    System.out.print("  ");
              for (int j = 1; j <= i; j++)
                    System.out.print("# ");
              for (int k = 1; k < i; k++)
                    System.out.print("# ");
              System.out.println();
        }
        System.out.println();
	}
	public static void printPatternM(int size){
		int b=1;
		for(int i=0;i<size;i++){
			for(int j=0;j<=i;j++){
				System.out.print(b+j+" ");
			}
			System.out.println();
		}
	}
	public static void printPatternN(int size){
		for(int i=0;i<size;i++){
			int b=1;
			for(int j=0;j<size;j++){
				if(j<i){
					System.out.print("  ");
				}else{
					System.out.print(b+" ");
					b++;
				}
			}
		System.out.println("");
		b=1;
		}
	}
	public static void printPatternO(int size){
		for(int i=0;i<size;i++){
			int b=1+i;
			for(int j=0;j<=size;j++){
				if(j>=(size-i)){
					System.out.print(b+" ");
					b--;
				}else{
					System.out.print("  ");
				}
			}
			System.out.println("");
			b=0;
		}
	}
	public static void printPatternP(int size){
		for(int i=0;i<size;i++){
			for(int j=0;j<size-i;j++){
					System.out.print("# ");					
			}
		System.out.println("");
		}
	}
}

