package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/")
	public String sayHello(){
		return "Hello... Welcome to SpringBoot Application.. Its awesome to learn this..!!!";
	}
}
