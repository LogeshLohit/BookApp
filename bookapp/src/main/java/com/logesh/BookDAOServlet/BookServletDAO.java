package com.logesh.BookDAOServlet;

import java.awt.Button;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.jdbc.core.JdbcTemplate;

import com.logesh.BookDAO.BookDAO;
import com.logesh.connectionUtil.ConnectionUtil;
import com.logesh.modal.Book;

/**
 * Servlet implementation class BookServletDAO
 */
public class BookServletDAO extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookServletDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
/*	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		 * int id=Integer.parseInt(request.getParameter("bookid")); String
		 * name=request.getParameter("bookname"); String
		 * author=request.getParameter("bookauthor"); int
		 * price=Integer.parseInt(request.getParameter("bookid"));
		 
		BookDAO bookDAO = new BookDAO();
		Book book = new Book();

		
		 * book.setBookid(id); book.setBookname(name);
		 * 
		 * bookDAO.modify(book);
		 * 
		 
		List<Book> books = bookDAO.listAllBook();
		for (Book book1 : books) {
			System.out.println(book1);
		}
		
		String l="logesh";
		request.setAttribute("l", l);
//		request.getRequestDispatcher("index.jsp").forward(request, response);

		System.out.println("on console");
		printWriter.println("logeshfiles----------------------------");

	}

*/}
