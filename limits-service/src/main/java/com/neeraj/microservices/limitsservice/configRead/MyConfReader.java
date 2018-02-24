package com.neeraj.microservices.limitsservice.configRead;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class MyConfReader {
	private int maximum;
	private int minimum;
	public MyConfReader() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	

}
