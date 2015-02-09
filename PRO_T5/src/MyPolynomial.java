import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MyPolynomial {
	private double[] coeffs;
	
	private int x;
	public MyPolynomial(double... coeffs){
		this.coeffs=coeffs;
	}
	public MyPolynomial(String filename){
		Scanner in=null;
		try{
			in=new Scanner(new File(filename)); //openfile
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		int degree=in.nextInt(); //read the degree
		coeffs=new double[degree+1]; //allocate the array
		for (int i=0;i<coeffs.length;i++){
			coeffs[i]=in.nextDouble();
		}
	}
	public double getGrade( int x){
		double d;
		d=coeffs[x];
		return d;
	}
	public double getDegree(){
		double d;
		d=coeffs[coeffs.length-1];
		return d;
	}
	public String toString(){
		String s="";
		for (int i=coeffs.length-1;i>=0;i--){
			s=s+coeffs[i]+"x^"+i+" + ";
		}
		return s;	
	}
	private double toPower(double value, int pow){
		double res=1;
		for (int i=0;i<pow-1;i++){
			res=res*value;
		}
		return res;
	}	
	public double evaluate(double x){
		double d=0;
		for (int i=coeffs.length-1;i>=0;i--){
			d=d+Math.pow(coeffs[i],x);
		}
		return d;
	}
	/*public double evaluate2(double x){*/
	public MyPolynomial add(double... p1){
		double[] res;
		if (coeffs.length>p1.length){
			res=new double[coeffs.length];
			for (int i=coeffs.length-1;i>=0;i--){
				res[i]=coeffs[i];
			}
			for (int i=p1.length-1;i>=0;i--){
				res[i]=coeffs[i]+p1[i];
			}
		}else{
			res=new double[p1.length];
			for (int i=p1.length-1;i>=0;i--){
				res[i]=p1.length;
			}
			for (int i=coeffs.length-1;i>=0;i--){
				res[i]=coeffs[i]+p1[i];
			}
		}
		MyPolynomial p=new MyPolynomial(res);
		return p;
	}
	public MyPolynomial multiply(double...p1){
		double[] res;
		res=new double[coeffs.length+p1.length-1];
		for (int i=0;i<res.length;i++){
			res[i]=0;
		}
		for (int i=p1.length-1;i>=0;i--){
			for(int j=coeffs.length;i>=0;i--){
				res[i+j]+=coeffs[i]*p1[j];	
			}
		}
		MyPolynomial p=new MyPolynomial(res);
		return p;	
	}
	public MyPolynomial add(MyPolynomial p1){
		double[] res;
		double[] poly=new double[(int) p1.getDegree()];
		for (int i=0;i<poly.length;i++){
			poly[i]=p1.getGrade(i);
		}
		if (coeffs.length>poly.length){
			res=new double[coeffs.length];
			for (int i=coeffs.length-1;i>=0;i--){
				res[i]=coeffs[i];
			}
			for (int i=poly.length-1;i>=0;i--){
				res[i]=coeffs[i]+poly[i];
			}
		}else{
			res=new double[poly.length];
			for (int i=poly.length-1;i>=0;i--){
				res[i]=poly.length;
			}
			for (int i=coeffs.length-1;i>=0;i--){
				res[i]=coeffs[i]+poly[i];
			}
		}
		MyPolynomial p=new MyPolynomial(res);
		return p;
	}
	public MyPolynomial multiply(MyPolynomial p1){
		double[] res;
		double[] poly=new double[(int) p1.getDegree()];
		for (int i=0;i<poly.length;i++){
			poly[i]=p1.getGrade(i);
		}
		res=new double[coeffs.length+poly.length-1];
		for (int i=0;i<res.length;i++){
			res[i]=0;
		}
		for (int i=poly.length-1;i>=0;i--){
			for(int j=coeffs.length;i>=0;i--){
				res[i+j]+=coeffs[j]*poly[i];	
			}
		}
		MyPolynomial p=new MyPolynomial(res);
		return p;	
	}
}	
		
		
