package com.neeraj.microservices.currencyconversionservice.bean;

import java.math.BigDecimal;
public class CurrencyConversionBean {

	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionFactor;
	private int port;
	private int quantity;
	private int amount;
	public CurrencyConversionBean() {
		
	}
	
	
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionFactor, int port, int quantity,
			int amount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.port = port;
		this.quantity = quantity;
		this.amount = amount;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
}
