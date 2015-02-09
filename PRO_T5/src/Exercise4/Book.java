package Exercise4;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String b, Author a, double p){
		name=b;
		author=a;
		price=p;
	}
	public Book(String b, Author a, double p, int qty){
		name=b;
		author=a;
		price=p;
		qtyInStock=qty;
	}
	public String getName(){
		return name;
	}
	public Author getAuthor(){
		return author;
	}
	public double getPrice(){
		return price;
	}
	public int getQtyInStock(){
		return qtyInStock;
	}
	public String toString(){
		return name+" by "+author.toString();
	}
	public String getNameAuthor(){
		return getAuthor().getName();
	}
	public String getAuthorEmail(){
		return getAuthor().getEmail();
	}
	
		
	
}
