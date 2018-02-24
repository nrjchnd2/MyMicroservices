package com.neeraj.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neeraj.microservices.currencyexchangeservice.bean.CurrencyExchangeBean;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchangeBean, Long>{

	CurrencyExchangeBean findByFromAndTo(String from, String to);
}
