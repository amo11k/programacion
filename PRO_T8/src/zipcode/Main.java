package zipcode;

import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String zip=null;
		Scanner inzip=new Scanner(System.in);
		System.out.println("Introduce el c�digo postal");
		zip=inzip.next();
		System.out.println(ZipCode.getText(zip));

	}

}
