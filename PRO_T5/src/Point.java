//AMO11K
public class Point{
	private int x;
	private int y;
	
	public Point(){
		x=0;
		y=0;
	}
	public Point(int newX, int newY){
		x=newX;
		y=newY;
	}
	public String toString(){
		return "("+x+","+y+")";
	}
	public void moveTo(int newX, int newY){
		x=newX;
		y=newY;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int newX){
		 x=newX;
	}
	public void setY(int newY){
		y=newY;
	}
	public void setOffset(int offsetX, int offsetY){
		x=x+offsetX;
		y=y+offsetY;
	}
	public static double distance(Point p1, Point p2){
		int c1=p1.getX()-p2.getX();
		int c2=p1.getY()-p2.getY();
		double distance=Math.sqrt(c1*c1+c2*c2);
		return distance;
	}
}
