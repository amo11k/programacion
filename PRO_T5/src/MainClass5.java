
public class MainClass5 {

	public static void main(String[] args) {
		Point points[]=new Point[10];
		
		for (int i=0;i<points.length;i++){
			points[i]=new Point(i,i);
			System.out.print(points[i]);
		}
		
		Rectangle rectangles[]=new Rectangle[10];
		
		for (int i=0;i<rectangles.length;i++){
			rectangles[i]=new Rectangle(new Point(i,i),1,1);
			
			
		}
	}

}
