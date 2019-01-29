package com.microservices.limitsservice.bean;

public class LimitConfiguration {

	private int maximum;
	private int mininmum;
	
	protected LimitConfiguration() {
		
	}
	public LimitConfiguration(int maximum, int mininmum) {
		super();
		this.maximum = maximum;
		this.mininmum = mininmum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMininmum() {
		return mininmum;
	}
	public void setMininmum(int mininmum) {
		this.mininmum = mininmum;
	}
	
	
}
