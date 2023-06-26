package com.dal.pharma.exceptions;

public class CustomerInfoDoesNotExistException extends Exception {
	
	private String message;
    public CustomerInfoDoesNotExistException(String message) {
        super(message);
        this.message = message;
    }
    public CustomerInfoDoesNotExistException() {
        super("ERR :User Does Not Exists...!");

    }
}
