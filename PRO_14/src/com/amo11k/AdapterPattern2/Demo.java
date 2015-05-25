package com.amo11k.AdapterPattern2;

public class Demo {

	public static void main(String[] args) {
		ByteEater byteEater=new ByteEater(
				new BitToByteAdapter(new BitSpitter()));
				        byteEater.eatByte();
	}

}
