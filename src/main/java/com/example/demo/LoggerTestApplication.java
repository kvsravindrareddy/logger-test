package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class LoggerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggerTestApplication.class, args);
	}

	private static final Logger logger = Logger.getLogger(LoggerTestApplication.class.getName());

	@GetMapping(value = "/hello")
	public String hello() {
		for (int i = 0; i < 100000; i++) {
			logger.info("--------------------------" + i);

		}
		return "Hello";
	}
}