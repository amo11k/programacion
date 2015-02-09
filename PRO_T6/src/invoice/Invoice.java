package invoice;
import java.text.DecimalFormat;
import java.util.Date;
public class Invoice {
	private int num_invoice;
	private String buyer;
	private String seller;
	private double total_import;
	private String payType;
	private Date date;
	private InvoiceLine[] myLines;
	private static String LINE="____________________________________________________________________________";
	
	public Invoice(String buy, String sell, String type, Date date, InvoiceLine[] myLines){
		this.num_invoice=(int)(Math.random()*500);
		this.date=date;
		this.buyer=buy;
		this.seller=sell;
		this.payType=type;
		this.myLines=myLines;
	}
	public String print(){
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append(Invoice.printHeader());
		sBuilder.append("\n"+LINE+"\n");
		sBuilder.append(String.format("%12s | ",seller));
		sBuilder.append(String.format("%12s | ",buyer));
		sBuilder.append(String.format("%12s | ",payType));
		sBuilder.append(String.format("%12tD | ",date));
		sBuilder.append("\n"+LINE+"\n"+"\n"+"\n"+"\n"+LINE+"\n");
		sBuilder.append(InvoiceLine.printHeader2());
		for(int i=0;i<myLines.length;i++){
			sBuilder.append(String.format("%12s",myLines[i].printLines()));
		}
		sBuilder.append("\n");
		sBuilder.append(String.format("%66s Total | ",customFormat("$###,###,###.##",InvoiceLine.getTotal(myLines))));
		return sBuilder.toString();
	}
	private String customFormat(String string, double num) {
		DecimalFormat myFormatter = new DecimalFormat(string);
		String output = myFormatter.format(num);
		return output;
	}
	public static String printHeader(){
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append(String.format("%12s | %12s | %12s | %12s |","Seller","Buyer","Pay Type","Date"));
		return sBuilder.toString();
	}
}
