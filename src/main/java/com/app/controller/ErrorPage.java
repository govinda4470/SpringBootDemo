package com.app.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorPage implements ErrorController {

	private static final String path="/error";
	
	@Override
	public String getErrorPath() {
		return path;
	}
	
	@RequestMapping(path)
	public String showError(){
		return "url path is not mapped !!! :( ";
	}

}
