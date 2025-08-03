package com.library.user.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptions {
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<String> handlerUserException(UserException userException){
		return new ResponseEntity<>("User creation Failed", HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(UserAlreadyExistException.class)
	public ResponseEntity<String> handlerUserException(UserAlreadyExistException userException){
		return new ResponseEntity<>("User Already Exists with this Roll Number", HttpStatus.BAD_REQUEST);
		
	}

}
