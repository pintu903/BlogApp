package com.blog.exception;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalHandler {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<Error> userException(UserException e, WebRequest web){
		
		Error error = new Error(e.getMessage(),LocalDate.now(),LocalTime.now(),web.getDescription(false));
		
		return new ResponseEntity<Error>(error, HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Error> illegalArgumentException(IllegalArgumentException e, WebRequest web){
		
		Error error = new Error(e.getMessage(),LocalDate.now(),LocalTime.now(),web.getDescription(false));
		
		return new ResponseEntity<Error>(error, HttpStatus.BAD_GATEWAY);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Error> exception(Exception e, WebRequest web){
		
		Error error = new Error(e.getMessage(),LocalDate.now(),LocalTime.now(),web.getDescription(false));
		
		return new ResponseEntity<Error>(error, HttpStatus.BAD_GATEWAY);
	}
	
}
