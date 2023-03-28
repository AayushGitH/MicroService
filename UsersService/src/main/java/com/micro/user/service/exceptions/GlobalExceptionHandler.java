package com.micro.user.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.micro.user.service.payload.ApiResponse;

// Centralized exception handler
@RestControllerAdvice // This annotation is used for telling spring to enter if any exception occurs
public class GlobalExceptionHandler 
{
	// This method will call whenever any resource not found exception found in our whole project
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex)
	{
		String message = ex.getMessage();
		// Creating object only in one line with the help of builder lombok
		ApiResponse response = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
	}
}
