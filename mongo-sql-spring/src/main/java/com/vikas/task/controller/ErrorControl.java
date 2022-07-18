package com.vikas.task.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorControl {
	
	
	@ExceptionHandler(NoValuePresent.class)
	public ResponseEntity<String> handlenosuchelement(NoValuePresent elementexception) {
		return new ResponseEntity<String>("No Organization with given id is present", HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	@ExceptionHandler(NoEmployeePresent.class)
	public ResponseEntity<String> handlenosuchemployee(NoEmployeePresent elementexception) {
		return new ResponseEntity<String>("No Employees are present", HttpStatus.NOT_IMPLEMENTED);
	}
	
}
