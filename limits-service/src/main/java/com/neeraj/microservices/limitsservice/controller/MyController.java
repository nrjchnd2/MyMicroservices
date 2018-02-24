package com.neeraj.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neeraj.microservices.limitsservice.configRead.MyConfReader;
import com.neeraj.microservices.limitsservice.controller.bean.LimitServiceConfiguration;

@RestController
public class MyController {

	@Autowired
	private MyConfReader myConf;
	@GetMapping("/config")
	public LimitServiceConfiguration getConfiguration() {
		return new LimitServiceConfiguration(myConf.getMaximum(),myConf.getMinimum());
	}
}
