package com.scp.books;

import java.util.ArrayList;
import java.util.List;

public class TestBooks {
	
	public static void main(String[] args) {
		BookService service = new BookServiceImpl();
		//AB
		
		List<String> springBookAuthor1 = new ArrayList<>();
		springBookAuthor1.add("John");
		springBookAuthor1.add("Xyz");
		
		List<String> springBookAuthor2 = new ArrayList<>();
		springBookAuthor2.add("AAA");
		springBookAuthor2.add("VVV");
		
		List<String> hibernateBookAuthor1 = new ArrayList<>();
		hibernateBookAuthor1.add("Aqsasa");
		hibernateBookAuthor1.add("dsadsacxz");
		
		List<String> jspBookAuthor1 = new ArrayList<>();
		jspBookAuthor1.add("sASEQA");
		jspBookAuthor1.add("DSDAR");
		Book b1 = new Book("Spring", 101, 250, springBookAuthor1, "A");
		try {
			service.addBook(b1);
			service.addBook(new Book("Hibernate", 102, 350, hibernateBookAuthor1, "B"));
			service.addBook(new Book("JSP", 103, 223, jspBookAuthor1, "C"));
			service.addBook(new Book("Webservices", 104, 123, springBookAuthor1, "D"));
		} catch (DuplicateBookException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(service.getListOfBooks());
		
		List<String> jspBookAuthorD = new ArrayList<>();
		jspBookAuthor1.add("sASEQAsa");
		jspBookAuthor1.add("DSDAR");
		
		
		try {
			service.updateBook(new Book("Spring-Version2", 101, 300, springBookAuthor1, "A"));
		} catch (BookWithGivenIdNotPresent e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(service.searchBook(101));
		
		
		System.out.println("MultisearchExpecteTrue > "+service.searchBookWithMultipleParams(new Book("JSP", 103, 223, jspBookAuthor1, "C")));
		System.out.println("MultisearchExpecteFalse> "+service.searchBookWithMultipleParams(new Book("abcd", 103, 223, jspBookAuthor1, "C")));
		System.out.println("MultisearchExpecteFalse> "+service.searchBookWithMultipleParams(new Book("abcd", 103, 223, jspBookAuthor1, "D")));
		System.out.println("MultisearchExpecteFalse> "+service.searchBookWithMultipleParams(new Book("abcd", 103, 223, jspBookAuthorD, "C")));
		System.out.println("MultisearchExpecteFalse> "+service.searchBookWithMultipleParams(new Book("abcd", 103, 223, jspBookAuthor1, "C")));
		
	}
	
	
	
	
	
	
	
	
	

}
