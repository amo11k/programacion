package com.amo11k.AdapterPattern2;

public class BitSpitter {
	//each bit is represented using a string for this example
    public int nextBit(){
        int bit = (int) (Math.random()*2);
        return bit;
    }

}
