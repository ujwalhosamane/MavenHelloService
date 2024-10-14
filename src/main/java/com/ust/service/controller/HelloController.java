package com.ust.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class HelloController {

	@Autowired
	Environment environment;
	
	@GetMapping("/test")
	public String connection() {
		return "connected with "+ environment.getProperty("local.server.port") +"..... responding";
	}
	
	@GetMapping("/test/confirmation")
	public String confirm() {
		return "Confirmed!!........";
	}
}
