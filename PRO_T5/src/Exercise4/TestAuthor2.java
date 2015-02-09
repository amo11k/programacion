package Exercise4;

import java.io.*;

public class TestAuthor2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		DataInputStream in = null;
		String dataFile = "DatAuthor";
		String name, mail;
		char gender;

		try {
			in = new DataInputStream(new BufferedInputStream(
					new FileInputStream(dataFile)));

			while (true) {
				name = in.readUTF();
				mail = in.readUTF();
				gender = in.readChar();
				Author a1=new Author(name, mail, gender);
				System.out.format(a1.toString()+"\n");
			}
		}catch (EOFException e){}
		
		finally {
			in.close();
		}
	}
}
