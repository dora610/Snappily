package com.karuriSuro.snappily.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {
	private Logger logger = LoggerFactory.getLogger(Greet.class);

	@GetMapping("/greeting")
	public String greet(
			@RequestParam(value = "name", defaultValue = "World") 
			String name) {
		logger.trace("trace log");
		logger.debug("debug log");
		logger.info("info log");
		logger.warn("warn log");
		logger.error("error log");
		return "Hello " + name;
	}
}
