package com.book;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/editUrl")
public class EditSerlet extends HttpServlet {
	
	private static final String query ="UPDATE books SET bookName=?, bookEdition=?, bookPrice=? where bookId=?";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// getPrintwriter
		PrintWriter printWriter = resp.getWriter();
		// set content type
		resp.setContentType("text/html");
		
		//get id from record pass in booklist (href='editScreen?bookId')
		int bookId = Integer.parseInt(req.getParameter("bookId"));
		//get edit data we want to edit
		String bookName = req.getParameter("bookName");
		String bookEdition = req.getParameter("bookEdition");
		float bookPrice = Float.parseFloat(req.getParameter("bookPrice"));

		// load the jdbc driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// generate connection using trywithresource(url for mysql
		// (jdbc:mysql:///atozdb)
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atozdb", "root", "root");

				PreparedStatement statement = con.prepareStatement(query);) {
			statement.setString(1, bookName);
			statement.setString(2, bookEdition);
			statement.setFloat(3, bookPrice);
			statement.setInt(4, bookId);
			
			int count = statement.executeUpdate();
			if(count == 1) {
				printWriter.println("<h1>Edited is Successful</h1>");
			}else
			
			{
				printWriter.println("<h1>Not Edited</h1>");
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
			// message for browser key
			printWriter.println("<h1>" + se.getMessage() + "</h1>");
		} catch (Exception e) {
			e.printStackTrace();
			printWriter.println("<h1>" + e.getMessage() + "</h1>");
		}
		
		// Here also provide show data in registeraton page
				printWriter.println("<a href='home.html' style='text-align:center'>Home</a>");
				printWriter.println("<br>");
				printWriter.println("<a href='booklist'>Book List</a>");


	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp); // this method will call at time dopost method
	}


}
