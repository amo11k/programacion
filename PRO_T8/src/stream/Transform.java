package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Transform {

	public static void main(String[] args)throws IOException {
		BufferedReader in=null;
		PrintWriter out=null;
		
		try{
			in=new BufferedReader(new FileReader(args[0]));
			out=new PrintWriter(new FileWriter(args[1]));
			String l;
			
			while((l=in.readLine())!=null){
				out.println(l.toUpperCase());
			}
		}finally{
			if(in!=null){
				in.close();
			}
			if(out!=null){
				out.close();
			}
		}
	}

}