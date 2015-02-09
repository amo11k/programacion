package randomAccess;

import java.io.*;
import java.util.*;

public class ReadAddressBook {

	public static void main(String[] args) throws IOException {
		RandomAccessFile data=null;
		try{
			Hashtable indexHash=new Hashtable();
			BufferedReader index = new BufferedReader(new FileReader("phone.idx"));
			String line;
			while ((line = index.readLine()) !=null)
				indexHash.put(line, new Long(index.readLine()));
			index.close();
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			data = new RandomAccessFile("phone.dat", "r");
			AddressData d = new AddressData();
			boolean done=false;
			while (!done){
				System.out.println("Name: ");
				String name = in.readLine();
				if (name.equals(""))
					done = true;
				else{
					Long position = (Long)indexHash.get(name);
					if (position==null)
						System.out.println(name+" not found!");
					else{
						data.seek(position.longValue());
						d.readFrom(data);
						System.out.println(d.report());
					}
				}
			}
		}finally{
			data.close();
		}
	}

}
