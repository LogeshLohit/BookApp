package com.logesh.BookDAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.logesh.connectionUtil.ConnectionUtil;
import com.logesh.modal.Book;

public class BookDAO {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void addBook(Book book) {
		String sql = "insert into book values(?,?,?,?);";
		Object[] params = { book.getBookid(), book.getBookname(), book.getBookauthor(), book.getBookprice() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println(rows);
	}
	// public List<Book> findAll() {
	//
	// String query = "SELECT bookname,bookauthor from book;";
	// List<Book> courses = jdbcTemplate.query(query, (rs, rows) -> {
	// Book book = convert(rs);
	// return book;
	// });
	// return courses;
	// }
	//
	// private Book convert(ResultSet rs) throws SQLException {
	//
	// Book book = new Book();
	// // course.setCode(rs.getString("CODE"));
	// book.setBookname(rs.getString("bookname"));
	// book.setBookauthor(rs.getString("bookauthor"));;
	// return book;
	//
	// }
	
	public Book modify(Book book)
	{	String sql="UPDATE book set  bookname=? WHERE bookid=?;";
		Object[] params={book.getBookname(),book.getBookid()};
		int rows = jdbcTemplate.update(sql,params);
		System.out.println("No of rows updated:" + rows);
		return book;
	}
	

	public List<Book> listAllBook() {
		String sql = "SELECT bookid,bookname,bookauthor,bookprice from book;";
		List<Book> booknames = jdbcTemplate.query(sql, (rs, rowNum) -> {
			Book book = new Book();
			//System.out.println(rs.getString(1));
			
			book.setBookid(rs.getInt("bookid"));
			book.setBookname(rs.getString("bookname"));

			book.setBookauthor(rs.getString("bookauthor"));
			book.setBookprice(rs.getInt("bookprice"));
			return book ;
		});

		return booknames; 

	}

}
