package com.example.bookmarkservice.exception;

public class BookmarkNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public BookmarkNotFoundException(String exMessage) {
		super("Could not find bookmarkId: " + exMessage);
	}
	
}
