//AMO11K
public class MainClass2 {
	public static void main(String[]args){
		Point p1, p2;
		p1=new Point(4,5);
		p2=new Point(6,8);
		
		p1.setOffset(4,6);
		p2.setOffset(4,5);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		Segment s=new Segment(p1,p2);
		System.out.println("Module= "+s.calcModule());
		System.out.println(s.toString());
		
	}
}
