package zipcode;

import java.util.Scanner;
import java.io.*;

public class ZipCode {

	@SuppressWarnings("resource")
	public static String getText(String zipcode) throws IOException {
		String s = null;
		BufferedReader in = null;
		boolean found = false;
		StringBuilder result = new StringBuilder();
		String codigo=null, city=null,whatIs=null,zip=null,name=null;

		in = new BufferedReader(new FileReader("municipios-calles.txt"));
		Scanner scan = null;
		try {
			while (((s = in.readLine()) != null)&&(found != true)) {
				scan = new Scanner(s);
				scan.useDelimiter(";");
				codigo = scan.next();
				city = scan.next();
				whatIs = scan.next();
				zip = scan.next();
				name = scan.next();
				if (zip.equals(zipcode)) {
					found = true;
					if(whatIs.equals("true")){
						result.append("Codigo ciudad: "+codigo+"\n");
						result.append("Nombre: "+city+"\n");
						result.append(zip+"\n");
						result.append("Street: "+name);
					}else{
						result.append("Codigo pueblo: "+codigo+"\n");
						result.append("Provincia: "+city+"\n");
						result.append("Postal code"+zip+"\n");
						result.append("Nombre: "+name);
					}
					break;
				}
			}
		} finally {
			scan.close();
		}
		return result.toString();
	}
}
