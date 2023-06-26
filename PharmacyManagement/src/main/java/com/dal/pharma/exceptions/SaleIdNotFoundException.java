package com.dal.pharma.exceptions;

public class SaleIdNotFoundException extends Exception {
	private String message;
	public SaleIdNotFoundException(String message) {
		super(message);
		this.message = message;
	}

	public SaleIdNotFoundException() {
		super("Err :Sale Not Exists...!");

	}
}
