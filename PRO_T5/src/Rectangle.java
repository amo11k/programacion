
public class Rectangle extends Point {
	private static int width;
	private static int height;
	
	
	//The origin point will be bottom-left Point
	//25
	public Rectangle(){
		super();
		width=0;
		height=0;
	}
	//27
	public String toString(){
		return super.toString()+"width: "+width+" and height: "+height;
	}
	public Rectangle(Point origin, int w, int h){
		super(origin.getX(),origin.getY());
		width=w;
		height=h;
		
	}
	public Rectangle(Point startP, Point endP){
		super(startP.getX(),startP.getY());
		width=Math.abs(endP.getX()-startP.getX());
		height=Math.abs(endP.getY()-startP.getY());
	}//33
	public int getArea(){
		int a;
		a=width*height;
		return a;
	}//34
	public Point getPoint(){
		Point p= new Point(getX(),getY());
		return p;
	}//36
	public Point getTopLeftPoint(){
		Point p=new Point(getX(),getY()+height);
		return p;
	}//37
	public Point getTopRightPoint(){
		Point p=new Point(getX()+width,getY()+height);
		return p;
	}//39
	public Point getBottomRightPoint(){
		Point p=new Point(getX()+width,getY());
		return p;
	}
	public Point getBottomLeftPoint(){
		return getPoint();
	}//41
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public void setWidth(int w){
		width=w;	
	}
	public void setHeight(int h){
		height=h;
	}
}
















