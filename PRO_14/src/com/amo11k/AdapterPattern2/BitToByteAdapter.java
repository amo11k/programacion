package com.amo11k.AdapterPattern2;

public class BitToByteAdapter implements ByteSpitterIntf{
	BitSpitter bitSpitter;
	
	public BitToByteAdapter(BitSpitter bitSpitter) {
        this.bitSpitter=bitSpitter;
   }

	@Override
	public byte nextByte() {
		String bitString="";
        for(int i=0;i<8;i++)
            bitString+=bitSpitter.nextBit();
        	System.out.println(bitString);
        return (byte)Integer.parseInt(bitString,2);
   }
}
