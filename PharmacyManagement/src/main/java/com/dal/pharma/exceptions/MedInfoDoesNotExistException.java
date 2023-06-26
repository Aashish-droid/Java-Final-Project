package com.dal.pharma.exceptions;

public class MedInfoDoesNotExistException extends Exception {

	private String message;
	public MedInfoDoesNotExistException(String message) {
		super(message);
		this.message = message;
	}

	public MedInfoDoesNotExistException() {
		super("Err :Medicine Does Not Exists...!");

	}
}
