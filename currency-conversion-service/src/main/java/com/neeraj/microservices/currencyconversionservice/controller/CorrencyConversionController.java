package com.neeraj.microservices.currencyconversionservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.neeraj.microservices.currencyconversionservice.bean.CurrencyConversionBean;
import com.neeraj.microservices.currencyconversionservice.proxy.CurrencyExchangeProxy;

@RestController
public class CorrencyConversionController {

	@Autowired
	private CurrencyExchangeProxy proxy;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getCurrencyConversionBean(@PathVariable String from, @PathVariable String to,
			@PathVariable int quantity) {

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConversionBean> forEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange-service/from/{from}/to/{to}", CurrencyConversionBean.class,
				uriVariables);
		CurrencyConversionBean conversionBean = forEntity.getBody();

		return new CurrencyConversionBean(conversionBean.getId(), from, to, conversionBean.getConversionFactor(),
				conversionBean.getPort(), quantity, (quantity * conversionBean.getConversionFactor().intValueExact()));
	}

	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getCurrencyConversionBeanFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable int quantity) {

		CurrencyConversionBean conversionBean = proxy.getCurrecyExchanged(from, to);
		return new CurrencyConversionBean(conversionBean.getId(), from, to, conversionBean.getConversionFactor(),
				conversionBean.getPort(), quantity, (quantity * conversionBean.getConversionFactor().intValueExact()));
	}

}
