package com.neeraj.microservices.limitsservice.controller.bean;

public class LimitServiceConfiguration {

	private int maximum;
	private int minimum;
	
		public LimitServiceConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LimitServiceConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	
	
}
