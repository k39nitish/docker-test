package com.docker.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping("/")
	public String hello() {
		
		return "Hello Welcome to Docker API";
	}
	
	@GetMapping("/hello")
	public @ResponseBody Object welcome() {
			String s =  "First Test Hello world API";
			
			return new ResponseEntity<String>(s,HttpStatus.ACCEPTED);
	}
}
