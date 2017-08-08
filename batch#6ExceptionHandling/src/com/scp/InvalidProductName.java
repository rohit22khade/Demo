package com.scp;

public class InvalidProductName extends Exception {

	public InvalidProductName(String message) {
		super(message);
	}

}

class ProductWithGivenNameOrIdNotFound extends Exception{
	public ProductWithGivenNameOrIdNotFound(String message) {
		super(message);
	}
}

