package com.example.bookmarkservice.exception;

public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String exMessage) {
		super("Could not find username: " + exMessage);
	}
	
}
