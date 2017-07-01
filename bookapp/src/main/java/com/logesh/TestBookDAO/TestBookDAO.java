package com.logesh.TestBookDAO;

import java.util.ArrayList;
import java.util.List;

import com.logesh.BookDAO.BookDAO;
import com.logesh.modal.Book;

public class TestBookDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookDAO dao=new BookDAO();
		Book book=new Book();

		book.setBookauthor("twoiKDJt");
		book.setBookid(98);
		book.setBookname("niij");
		book.setBookprice(786);
		dao.addBook(book);
		
	/*	book.setBookid(213);
		book.setBookname("lognew");
		dao.modify(book);
	*/	
		List<Book> books=dao.listAllBook();
		for(Book book1:books)
		{
			System.out.println(book1);
		}
			
		
		
		//dao.listAllBook();
		
	}

}
