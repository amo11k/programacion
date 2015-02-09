
public class Test {

	public static void main(String[] args) {
		MyPolynomial p1=new MyPolynomial (1.1,2.2,3.3);
		MyPolynomial p2=new MyPolynomial (1.1,2.2,3.3,4.4,5.5);
		
		double[] coeffs={1.2,3.4,5.6,7.8};
		MyPolynomial p3=new MyPolynomial(coeffs);
		Point po1=new Point(3,3);
		Point po2=new Point(5,3);
		Point po3=new Point(5,5);
		
		
		Triangle t1=new Triangle(po1,po2,po3);
		System.out.println(t1.getPerimeter());

		System.out.println(t1.printType());
		double x=Point.distance(po1,po2);
		double y=Point.distance(po2,po3);

		System.out.println(x+"-"+y);
		System.out.println(p1.multiply(p2).toString()); 
		System.out.println(p1.toString());
		
		
		
		
		
		
	}

}
