package Exercise4;

import java.util.Scanner;
public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String n, String e, char g){
		name=n;
		email=e;
		gender=g;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public char getGender(){
		return gender;
	}
	public void setEmail(String newEmail){
		email=newEmail;
	}
	public String toString(){
		return name+" ("+gender+") at "+email;
	}
	
	public static Author readKeyboard(){
		String n, e;
		char g='a';
		
		System.out.println("Introduce the author's name");
		Scanner in = new Scanner(System.in);
	    n= in.next();
	    
	    System.out.println("Introduce the author's e-mail");
	    e= in.next();
	    
	    while ((g!='F')&&(g!='M')){
	    	System.out.println("Introduce the author's sex (Just type F or M)");
		    g= in.next().toUpperCase().charAt(0);
		    if((g!='F')&&(g!='M')){
		    	System.out.print("ERROR: WRONG GENDER. ");
		    }
	    }
	    
	    Author a=new Author(n,e,g);
		return a;
	}
	
	
}
