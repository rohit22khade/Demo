package com.scp.books;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService{
	
	static List<Book> listOfBooks = new ArrayList<>();
	
	
	/**
	 * AddBook
	 * 	Check for duplicate
	 * 	if duplicate
	 * 		throw exception
	 *  else
	 *  	addbook to list
	 * 
	 * 
	 */
	@Override
	public boolean addBook(Book alelaBook) throws DuplicateBookException {
		boolean returnVal=false;
		if(null!=checkForBook(alelaBook.getBookId())){
			throw new DuplicateBookException("Book with same is already exist");
		}else{
			listOfBooks.add(alelaBook);
			returnVal=true;
		}
			return returnVal;
	}

	private Book checkForBook(int bookId) {
		for (Book bItem : listOfBooks) {
			if(bItem.getBookId()==bookId)
				return bItem;
		}
		return null;
		
	}

	
	/**
	 * checkbook is present or not
	 * 	if present
	 * 		get new value from user object and set to old object
	 * 
	 */
	@Override
	public boolean updateBook(Book userObject) throws BookWithGivenIdNotPresent {
		boolean returnVal=false;
		Book oldObject = checkForBook(userObject.getBookId());
		//for (Book oldObject : listOfBooks) {
		if(null!=oldObject){
				if(oldObject.getBookId()==userObject.getBookId()){
					oldObject.setBookName(userObject.getBookName());
					oldObject.setBookPrice(userObject.getBookPrice());
					oldObject.setAuthorNames(userObject.getAuthorNames());
					oldObject.setPublication(userObject.getPublication());
					returnVal=true;
				}
					
			}
		return returnVal;
	}

	@Override
	public boolean deleteBook(int bookId) {
		return listOfBooks.remove(checkForBook(bookId));
	}

	@Override
	public Book searchBook(int bookId) {
		for (Book book : listOfBooks) {
			if(book.getBookId()==bookId)
				return book;
		}
		return null;
	}

	@Override
	public Book searchBookWithMultipleParams(Book book) {
		Book returnVal=null;
		for (Book bItem : listOfBooks) {
			if(book.getBookName().equals(bItem.getBookName())
			  && bItem.getPublication().equals(book.getPublication()))		
					{
				for(String authorName : bItem.getAuthorNames()){
					if(book.getAuthorNames().contains(authorName))
						returnVal=bItem;
					else{
						returnVal=bItem;
						break;
					}
				}
			}
				break;
		}
		
		return returnVal;
	}

	@Override
	public List<Book> getListOfBooks() {
		return listOfBooks;
	}

}
