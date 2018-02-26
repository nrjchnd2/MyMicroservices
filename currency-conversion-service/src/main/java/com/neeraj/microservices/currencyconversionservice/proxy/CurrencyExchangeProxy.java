package com.neeraj.microservices.currencyconversionservice.proxy;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.neeraj.microservices.currencyconversionservice.bean.CurrencyConversionBean;
//@FeignClient(name="currency-exchange-service")
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeProxy {
	
	//@GetMapping("/currency-exchange-service/from/{from}/to/{to}")
	@GetMapping("/currency-exchange-service/currency-exchange-service/from/{from}/to/{to}")
	public CurrencyConversionBean getCurrecyExchanged(@PathVariable("from") String from, @PathVariable("to") String to);

}
