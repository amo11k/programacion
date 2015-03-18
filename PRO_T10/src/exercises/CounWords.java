package exercises;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CounWords {

	private final static String FILENAME = "text.txt";
	private final static String REGEX = "";

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		File inputFile=new File(FILENAME);
		int count=0;
		String l;
		try{
			reader=new BufferedReader(new FileReader(FILENAME));
			Pattern pattern=Pattern.compile("\\b\\w+\\b");
			Matcher matcher;
			while((l=reader.readLine())!=null){
				matcher=pattern.matcher(l);
				while(matcher.find()){
					count++;
				}
			}
			System.out.println("Words: "+count);
			
			
		}finally{
			reader.close();
		}
	}

}
