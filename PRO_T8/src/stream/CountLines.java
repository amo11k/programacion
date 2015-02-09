package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CountLines {

	public static void main(String[] args)throws IOException {
		BufferedReader in=null;
		PrintWriter out=null;
		
		
		try{
			in=new BufferedReader(new FileReader(args[0]));
			String l;
			int count=0;
			
			while((l=in.readLine())!=null){
				count++;
			}
			System.out.println(count);
			
		}finally{
			if(in!=null){
				in.close();
			}
		}
	}
}