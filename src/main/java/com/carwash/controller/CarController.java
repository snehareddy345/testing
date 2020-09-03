package com.carwash.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/app")
public class CarController {

	@RequestMapping(value = "/checklogin")
	public String helloWorld() {
		return "Hello World!";
	}
	
}