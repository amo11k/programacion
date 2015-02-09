package Exercise4;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestAuthor {

	static final String dataFile = "DatAuthor";
	static String name;
	static String mail;
	static char gender;

	public static void main(String[] args) throws IOException {
	
		Author[] authors=new Author[3];
		for (int i=0;i<3;i++){
			authors[i] = Author.readKeyboard(); 
		}
		
		TestAuthor.dataConverter(authors);

	}
	
	public static void dataConverter(Author[] authors) throws IOException{
		DataOutputStream out=null;
		try {
			out = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream(dataFile)));
			for (int i=0;i<authors.length;i++){
				out.writeUTF(authors[i].getName());
				out.writeUTF(authors[i].getEmail());
				out.writeChar(authors[i].getGender());
			}
			
		} finally {
			out.close();
		}
	}
}
