package com.example.demo.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(MenuItemNotFoundException.class) 
	public void  springHandleMenuItemNotFoundException(HttpServletResponse response) throws IOException{
	  response.sendError(HttpStatus.NOT_FOUND.value(), "Menu not found......");
	}
	
	@ExceptionHandler(TokenExpiredException.class) 
	public void  springHandleTokenExpiredException(HttpServletResponse response) throws IOException{
	  response.sendError(HttpStatus.NOT_FOUND.value(), "Token is expired......");
	}
}
