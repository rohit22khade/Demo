package com.scp.books;

import java.util.List;

/**
 * 
 * @author Progvaltion_11
 *
 */
public interface BookService {
	//These are the pure contracts--- implementation should be
	//given by implemented classes
	public boolean addBook(Book book) throws DuplicateBookException;
	public boolean updateBook(Book book) throws BookWithGivenIdNotPresent;
	public boolean deleteBook(int bookId);
	public Book searchBook(int bookId);
	public Book searchBookWithMultipleParams(Book book);
	public List<Book> getListOfBooks();

}
