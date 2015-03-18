package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheToZe {
	private static final String FILENAME = "text.txt";
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		File inputFile=new File(FILENAME);
		String l;
		try{
			reader=new BufferedReader(new FileReader(FILENAME));
			while((l=reader.readLine())!=null){
					String s = l.replaceAll("\\bthe\\b", "ze");
					System.out.println(s);
			}			
		}finally{
			reader.close();
		}

	}

}
