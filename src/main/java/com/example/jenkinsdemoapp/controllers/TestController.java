package com.example.jenkinsdemoapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<String>("welcome to - STC 09/02/2021  Demo project for CICD Pipeline ", HttpStatus.OK);
	}
	
	@GetMapping("/home/{name}")
	public ResponseEntity<String> setParamName(@PathVariable("name") String name) {
		return new ResponseEntity<String>("Welcome to the app visitor: " + name, HttpStatus.OK);
	}
	
	@GetMapping("/contact")
	public ResponseEntity<String> getContactInfo(){
		return new ResponseEntity<String>("contact us at jdehbi.c@stcs.com.sa", HttpStatus.OK);
	}
}
