
public class Triangle {
	private Point v1,v2,v3;
	private String type;
	
	
	
	public Triangle(int x1,int y1,int x2,int y2,int x3,int y3){
		v1=new Point(x1,y1);
		v2=new Point(x2,y2);
		v3=new Point(x3,y3);
	}
	public Triangle(Point v1,Point v2,Point v3){
		this.v1=new Point(v1.getX(),v1.getY());
		this.v2=new Point(v2.getX(),v2.getY());
		this.v3=new Point(v3.getX(),v3.getY());
		
	}
	public String toString(){
		return "Triangle @ "+v1.toString()+", "+v2.toString()+", "+v3.toString();
	}
	public double getPerimeter(){
		double perimeter=0;
		double d1=Point.distance(v1,v2);
		double d2=Point.distance(v1,v3);
		double d3=Point.distance(v2,v3);
		perimeter=d1+d2+d3;
		return perimeter;
	}
	public String printType(){
		double d1=Point.distance(v1,v2);
		double d2=Point.distance(v1,v3);
		double d3=Point.distance(v2,v3);
		if ((d1==d2)&&(d2==d3)){
			type="Equilateral";
		}else{
			if ((d1!=d2)&&(d1!=d3)&&(d2!=d3)){
				type="Scalene";
			}else{
				type="Isosceles";
			}
		}
		return type;
	}
}