package maps;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class LastName {

	public static void main(String[] args) throws IOException {

		Map<String, Integer> map = new HashMap<>();
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		Scanner scan;

		String line;
		try {
			while ((line = in.readLine()) != null) {
				scan = new Scanner(line);
				scan.useDelimiter(",");
				map.put(scan.next(),
						Integer.valueOf(scan.next().replaceAll("\\.", "")));
			}
		} finally {
			in.close();
		}
		String lastname;
		do{
			lastname =JOptionPane.showInputDialog(null,"Enter the lastname","Lastname?",JOptionPane.QUESTION_MESSAGE);
			lastname=lastname.toUpperCase();
			JOptionPane.showMessageDialog(null,"Frequenci is: "+map.get(lastname), "Result",JOptionPane.INFORMATION_MESSAGE);
		}while(!lastname.equals(""));
	}

}
