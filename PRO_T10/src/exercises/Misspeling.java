package exercises;

import java.io.*;
import java.util.regex.*;

public class Misspeling {
	private static final String FILENAME = "misspellings.txt";
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new FileReader(FILENAME));
		File inputFile = new File(FILENAME);
		
		try{
			Pattern pattern = Pattern.compile("^\\w \\(.*|.* .*\\)$");
			Matcher matcher;
			String l;
			while ((l=reader.readLine())!= null){
				matcher=pattern.matcher(l);
				if(!matcher.find()){
					System.out.println(l);
				}
				
			}
		}finally{
			reader.close();
		}

	}

}
