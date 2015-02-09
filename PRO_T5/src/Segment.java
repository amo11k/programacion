//AMO11K
public class Segment {
	private Point startPoint;
	private Point endPoint;
	public Segment(Point startP, Point endP){
		startPoint=startP;
		endPoint=endP;
	}//17
	public Segment(){
		startPoint=new Point();
		endPoint=new Point();
	}//18
	public double calcModule(){
		double x=Math.pow((endPoint.getX()-startPoint.getX()),2);
		double y=Math.pow((endPoint.getY()-startPoint.getY()),2);
		return Math.sqrt(x+y);
	}//19
	public String toString(){
		int x=startPoint.getX();
		int y=startPoint.getY();
		int z=endPoint.getX();
		int t=endPoint.getY();
		return "("+x+","+y+")-("+z+","+t+")";
	}//20
	public void setOffset(int offsetX, int offsetY){
		startPoint.setOffset(offsetX, offsetY);
		endPoint.setOffset(offsetX, offsetY);
	}//21
	public void setStartPoint(Point p){
		startPoint=p;
	}
	public void setEndPoint(Point t){
		endPoint=t;
	}//23
	public Point getStartPoint(){
		return startPoint;
	}
	public Point getEndPoint(){
		return endPoint;
	}
	
	
	
	
	
	
	
	
	
	
}
