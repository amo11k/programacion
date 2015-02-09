package stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExerciseCSV2 {

	public static void main(String[] args) throws IOException {
		String s,item = null;
		Scanner s2 = null;
		int count = 0;
		int itemNumeric;
		String[] fields;
		int[] suma;

		if (args.length != 1) {
			System.err.println("Usage: CalculateCSV <CSV file>");
			System.exit(1);
		}
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		try {
			s = in.readLine();
			s2 = new Scanner(s);
			s2.useDelimiter(",");
			while (s2.hasNext()) {
				count++;
				s2.next();
			}
			s2.close();
			fields = new String[count];
			suma = new int[count];

			Scanner s3 = new Scanner(s);
			s3.useDelimiter(",");
			for (int i = 0; i < count; i++) {
				fields[i] = s3.next();
				suma[i] = 0;
			}
			s3.close();
			while ((s=in.readLine())!=null){
				Scanner scan= new Scanner(s);
				scan.useDelimiter(",");
				int colum=0;
				while(scan.hasNext()){
					item=scan.next();
					itemNumeric = Integer.parseInt(item.replaceAll("[^0-9-]",""));
					if (colum>=count){
						System.out.println("Wrong CSV format");
						System.exit(1);
					}
					suma[colum]= suma[colum]+itemNumeric;
					colum++;
				}
				scan.close();
				
			}
			for (int i=0;i<count;i++){
				System.out.println(fields[i]+": "+suma[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File " + args[0] + " wasn't found");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Error reading file" + args[0]);
			System.exit(1);
		}
	}
}