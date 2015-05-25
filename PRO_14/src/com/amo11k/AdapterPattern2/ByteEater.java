package com.amo11k.AdapterPattern2;

public class ByteEater {
	ByteSpitterIntf byteSpitter;

	public ByteEater(ByteSpitterIntf byteSpitter) {
		this.byteSpitter = byteSpitter;
	}

	public void eatByte() {
		byte b = byteSpitter.nextByte();
		System.out.println(b);
	}
}
