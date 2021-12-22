package com.example.demo.exception;

public class MenuItemNotFoundException extends RuntimeException{

	public MenuItemNotFoundException(String msg) {
		super(msg);
	}
}
