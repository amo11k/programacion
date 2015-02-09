package data_stream;

import java.io.*;
public class DataStream {

	static final String dataFile = "invoicedata";

	static final double[] prices = { 19.99, 9.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static String[] descs = { "Java T-shirt", "Java Mug",
			"Duke Junggling DOlls", "Java Pin", "Java Key chain", };

	public static void main(String[] args) throws IOException {

		DataOutputStream out = null;

		try {
			out = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream(dataFile)));
			for (int i = 0; i < prices.length; i++) {
				out.writeDouble(prices[i]);
				out.writeInt(units[i]);
				out.writeUTF(descs[i]);
			}
		} finally {
			out.close();
		}
	}

}
