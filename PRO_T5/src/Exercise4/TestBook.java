package Exercise4;

public class TestBook {

	public static void main(String[] args) {
		Author a1=new Author("Ruben", "amoros_11@hotmail.com", 'm');
		Book b1=new Book("Programming for noobs", a1, 10.99,10);
		
		
		System.out.println(b1.getAuthor().getName()+", "+b1.getAuthor().getEmail());
		
		Book books[]=new Book[5];
		books[0]=new Book("Programming for noobs",a1,20.99,10);
		books[1]=new Book("Programming for noobs 2",a1,11.99,100);
		books[2]=new Book("Programming for noobs 3",a1,21.99,1000);
		books[3]=new Book("Programming for noobs 4",a1,100.99,2);
		books[4]=new Book("Programming for noobs 5",a1,11,230);
		
		for (int i=0;i<5;i++){
			System.out.println(books[i].toString());
		}
		
		
		
		
	}

}
