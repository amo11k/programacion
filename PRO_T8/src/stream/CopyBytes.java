package stream;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyBytes {

	public static void main(String[] args) throws IOException {
		FileReader in=null;
		FileWriter out=null;
		
		try{
			in= new FileReader("adele.txt");
			out=new FileWriter("outagain.txt");
			int c;
			
			while ((c=in.read()) !=-1){
				out.write(c);
			}
		}finally{
			if(in!=null){
				in.close();
			}
		}	if(out!=null){
				out.close();
		}
	}

}
