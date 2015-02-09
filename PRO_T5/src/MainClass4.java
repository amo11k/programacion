//26
public class MainClass4 {

	public static void main(String[] args) {
		/*Rectangle r=new Rectangle();
		
		System.out.println(r.toString());
		r.moveTo(4,7);
		System.out.println(r.toString());
		*/
		
		/*Point p=new Point(1,1);
		Rectangle r= new Rectangle(p,3,2);
		System.out.println(r.toString());*/
		
		/*Rectangle r=new Rectangle(new Point(5,5), new Point(10,7));
		System.out.println(r.toString());*/
		
		Rectangle r=new Rectangle(new Point(5,6),10,8);
		System.out.println(r.toString());
		System.out.print("Top left: "+r.getTopLeftPoint().toString());
		System.out.print(" Top Rigth: "+r.getTopRightPoint().toString());
		System.out.print(" Bottom left: "+r.getBottomLeftPoint().toString());
		System.out.print(" Bottom Right: "+r.getBottomRightPoint().toString());
		System.out.println(r.getWidth());
		
		

	
	}
	
	

}
