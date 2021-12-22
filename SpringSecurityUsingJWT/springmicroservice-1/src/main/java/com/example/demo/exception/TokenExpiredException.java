package com.example.demo.exception;

public class TokenExpiredException extends RuntimeException{

	public TokenExpiredException(String msg) {
		super(msg);
	}
}
