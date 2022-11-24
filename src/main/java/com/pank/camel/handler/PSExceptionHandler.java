package com.pank.camel.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PSExceptionHandler {
	
	@ExceptionHandler(value = {Exception.class})
	public String exceptionHandler(Exception e) {
		return e.getMessage();
	}

}
