package com.amo11k.exercise1;

public class Channel {
	private double frequency;
	private ChannelTypeEnum type;

	public Channel(double freq, ChannelTypeEnum type) {
		this.frequency = freq;
		this.type = type;
	}

	public double getFrequency() {
		return frequency;
	}

	public ChannelTypeEnum getTYPE() {
		return type;
	}

	@Override
	public String toString() {
		return "Frequency=" + this.frequency + ", Type=" + this.type;
	}

}
