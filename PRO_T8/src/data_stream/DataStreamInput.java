package data_stream;

import java.io.*;

public class DataStreamInput {

	public static void main(String[] args) throws IOException {
		DataInputStream in = null;
		double total = 0.0;
		String dataFile = "invoicedata";
		try {
			in = new DataInputStream(new BufferedInputStream(
					new FileInputStream(dataFile)));
			double price;
			int unit;
			String desc;
			
			try {
				while (true) {
					price = in.readDouble();
					unit = in.readInt();
					desc = in.readUTF();
					System.out.format("You ordered %d units of %s at $%.2f%n",
							unit, desc, price);
					total += unit * price;
				}
			} catch (EOFException e) {
			}
			System.out.format("For a TOTAL of: $%.2f%n", total);
		} finally {
			in.close();
		}

	}
}
