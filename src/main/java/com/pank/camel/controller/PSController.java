package com.pank.camel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PSController {
	 @GetMapping("/test")
	  public ResponseEntity<String> getText() {
	      return new ResponseEntity<>(test(), HttpStatus.OK);
	  }
	 
	 private String test() {
		int i =5;
		 
		 return "test";
	 }
}
