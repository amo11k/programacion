package stream;

import java.util.Scanner;
import java.io.*;

public class ExerciseCSV {

	public static void main(String[] args) throws IOException {
		String[] field;
		int[] sum;
		
		BufferedReader in=null;
		try{
			in = new BufferedReader(new FileReader("test.csv"));
			String s=null;
			Scanner s2=null;
			int count=0;
			while ((s=in.readLine())!=null){
				count++;
				try{
					s2=new Scanner(s);
					s2.useDelimiter(",");
					while (s2.hasNext()){
						System.out.println(s2.next());
					}
				}finally{
					s2.close();
				}
			}
		} finally{
			if(in!=null){
				in.close();
			}
		}
		
		

	}

}
