package invoice;
import java.text.DecimalFormat;

public class InvoiceLine {
	private int quantity;
	private String itemCode;
	private String description;
	private double prize;
	private double discountPercent;
	public static String LINE="____________________________________________________________________________";
	
	public InvoiceLine(int qtty, String item, String descrip, double prize, double discount){
		this.quantity=qtty;
		this.itemCode=item;
		this.description=descrip;
		this.prize=prize;
		this.discountPercent=discount/100;
		
	}
	public String printLines(){
		StringBuilder sBuilder=new StringBuilder();
		/*sBuilder.append(String.format("%12s | ","Quantity","Item","Description","Prize", "Discount"));*/
		
		sBuilder.append("\n");
		sBuilder.append(String.format("%12d | ",quantity));
		sBuilder.append(String.format("%12s | ",itemCode.toString()));
		sBuilder.append(String.format("%12s | ",description.toString()));
		sBuilder.append(String.format("%12s | ",customFormat("$###,###,###.##",prize)));
		sBuilder.append(String.format("%12s | ",customFormat("###,###,###.##%",discountPercent)));
		sBuilder.append("\n"+LINE);
		sBuilder.append("\n");
		return sBuilder.toString();
	}
	private String customFormat(String string, double num) {
		DecimalFormat myFormatter = new DecimalFormat(string);
		String output = myFormatter.format(num);
		return output;
	}
	public double getPrize(){
		return ((this.prize*this.quantity)*(1-(this.discountPercent/100)));
	}
	public int getQtty(){
		return quantity;
	}
	public static double getTotal(InvoiceLine[] l1){
		double total=0;
		for (int i=0;i<l1.length;i++){
			total+=l1[i].getPrize() ;
		}
		return total;
	}
	public static String printHeader2(){
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append(String.format("%12s | %12s | %12s | %12s | %12s |","Quantity","Item","Description","Prize","Discount"));
		sBuilder.append("\n"+LINE+"\n"+LINE);
		return sBuilder.toString();
	}
}
