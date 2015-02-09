package sortedfiletex;

import java.io.*;

public class SortedFileText{
	String name;

	public SortedFileText(String name) throws IOException {
		this.name = name;
		File original = new File(name);
		original.createNewFile();
	}

	public String getName() {
		return name;
	}

	public void put(String newString) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(name));
		PrintWriter out = new PrintWriter(new FileWriter("temp"));
		String line;
		boolean ready=false;
		File tempFile = new File("temp");
		File original = new File(name);
		tempFile.createNewFile();
		
		try{
			while ((line = reader.readLine()) != null){
				if ((line.compareTo(newString) > 0)&&(ready==false)) {
					out.println(newString);
					ready=true;
				}
				out.println(line);
			}
			if (!ready)
				out.println(newString);
			
		}finally{
			out.close();
			reader.close();
			original.delete();
			tempFile.renameTo(original);
		}
	}
	
	public int getNumElements() throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(name));
		int num=0;
		
		while (in.readLine() != null)
			num++;
		
		return num;
	}
	
	public String getElementAt(int index) throws IOException{
		BufferedReader in=new BufferedReader(new FileReader(name));
		String s=null;
		int count=1;
		
		while (count!=index){
			in.readLine();
			count++;
		}
		s = in.readLine();
		return s;
	}

}
