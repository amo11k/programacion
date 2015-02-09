//AMO11K
public class Main {
	public static void main(String[]args){
		Point p1, p2;
		p1=new Point();
		p2=new Point(4,6);
		
		p1.moveTo(6,7);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		Point[] array=new Point[10];
		for (int i=0;i<array.length;i++){
			array[i]=new Point(1,1);
			System.out.print(array[i].toString());
		}
		System.out.println("");
		for (int i=0;i<array.length;i++){
			array[i].moveTo(8,8);
			System.out.print(array[i].toString());			
		}
		System.out.print(p1.getX());
	}	
}
