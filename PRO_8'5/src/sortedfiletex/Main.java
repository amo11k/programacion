package sortedfiletex;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		SortedFileText file1= new SortedFileText("ruben");
		System.out.println(file1.getNumElements());
		System.out.println(file1.getElementAt(5));
		

	}

}
