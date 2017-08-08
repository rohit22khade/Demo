package com.scp;

import java.util.ArrayList;
import java.util.List;

public class TestExcetions {

	/*
	 * Try
	 * Catch
	 * Finally
	 * Throw
	 * Throws
	 * 
	 * Return scenerios
	 * throw scenerios
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Products p = new Products();
		
		try {
			System.out.println(p.searchInInvetoryById(105));
		} catch (ProductWithGivenNameOrIdNotFound | InvalidProductName e) {
			e.printStackTrace();
		}
		
		
		try {
			System.out.println(p.searchInInvetoryByName(null));
		} catch (InvalidProductName e) {
			e.printStackTrace();
			
		} catch (ProductWithGivenNameOrIdNotFound e) {
			e.printStackTrace();
		}
		
		System.out.println("prog executed successfully");
		
	}
}



