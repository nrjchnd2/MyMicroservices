package com.neeraj.microservices.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.neeraj.microservices.currencyexchangeservice.bean.CurrencyExchangeBean;
import com.neeraj.microservices.currencyexchangeservice.repository.CurrencyExchangeRepository;

@RestController
public class MyCurrencyExchangeControler {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private CurrencyExchangeRepository repo;
	
	@GetMapping("/currency-exchange-service/from/{from}/to/{to}")
	public CurrencyExchangeBean getCurrecyExchanged(@PathVariable String from, @PathVariable String to) {
		CurrencyExchangeBean bean=repo.findByFromAndTo(from, to);
		bean.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return bean;
	}
	
	@GetMapping("/currency")
	public String yo() {
		return "Hello";
	}


}
