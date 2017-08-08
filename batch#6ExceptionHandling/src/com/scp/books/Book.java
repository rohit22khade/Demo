package com.scp.books;

import java.util.List;

/**
 * Coding convetions
 * 
 * Variable/Method names should start with
 * small letter + camelcase
 * bookName, bookId
 * 
 * Class Name should start with Uppercase 
 * plus camelcase
 * BooksService
 * 
 * PackageName > should be in small letters
 * com.scp.books
 * 
 * constants - all uppercase and seperate 
 * new word with underscore  BOOKS_SERVICE
 * 
 * 
 * @author Progvaltion_11
 *
 *POJO > plain old java object
 *
 */
public class Book {

	private String bookName;
	private int bookId;
	private double bookPrice;
	private List<String> authorNames;
	private String publication;
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public List<String> getAuthorNames() {
		return authorNames;
	}
	public void setAuthorNames(List<String> authorNames) {
		this.authorNames = authorNames;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	
	//Call back method
	@Override
	public String toString() {
		return "\nBook [bookName=" + bookName + ", bookId=" + bookId + ", bookPrice=" + bookPrice + ", authorNames="
				+ authorNames + ", publication=" + publication + "]";
	}
	
	public Book(String bookName, int bookId, double bookPrice, List<String> authorNames, String publication) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.bookPrice = bookPrice;
		this.authorNames = authorNames;
		this.publication = publication;
	}
	
}
