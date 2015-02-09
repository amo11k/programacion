package invoice;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		InvoiceLine l1=new InvoiceLine(2, "AC123","OK", 481.156,4.55);
		InvoiceLine l2=new InvoiceLine(3, "TV365","OK", 1234.1234,2.00);
		InvoiceLine l3=new InvoiceLine(5, "RA258","OK", 26.35,21.00);
		InvoiceLine l4=new InvoiceLine(3, "SM965","OK", 454.185,8.55);
		InvoiceLine l5=new InvoiceLine(2, "KL365","OK", 54.685,5.55);
		InvoiceLine[] myLines=new InvoiceLine[5];
		myLines[0]=l1;
		myLines[1]=l2;
		myLines[2]=l3;
		myLines[3]=l4;
		myLines[4]=l5;
		Date date=new Date(2014,05,05);
		
		
		/*Invoice i1=new Invoice("Eric","Ruben","Tarjeta", date() )*/
		/*for (int i=0;i<5;i++){
			System.out.println(myLines[i].toString());
		}
		System.out.println(InvoiceLine.getTotal(myLines));*/
		Invoice i1=new Invoice("Ruben","Eric","Tarjeta",date,myLines);
		System.out.println(i1.print());
		
		
		
		
		

	}

}
