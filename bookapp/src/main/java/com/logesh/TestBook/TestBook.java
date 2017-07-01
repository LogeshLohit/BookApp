package com.logesh.TestBook;

import com.logesh.modal.Book;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setBookauthor("Dr.APJ Abdul Kalam");
		book.setBookid(173);
		book.setBookname("The Wings of fire");
		book.setBookprice(499);
		System.out.println(book);
	}

}
