package com.book;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteUrl")
public class DeleteServlet extends HttpServlet {

	private static final String query = "delete from books where bookId=?";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// getPrintwriter
		PrintWriter printWriter = resp.getWriter();
		// set content type
		resp.setContentType("text/html");

		// get id from record pass in booklist (href='editScreen?bookId')
		int bookId = Integer.parseInt(req.getParameter("bookId"));
	
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
			statement.setInt(1, bookId);
			
			int count = statement.executeUpdate();
			if (count == 1) {
				printWriter.println("<h1>Deleted is Successful</h1>");
			} else

			{
				printWriter.println("<h1>Not Deleted</h1>");
			}

		} catch (SQLException se) {
			se.printStackTrace();
			// message for browser key
			printWriter.println("<h1>" + se.getMessage() + "</h1>");
		} catch (Exception e) {
			e.printStackTrace();
			printWriter.println("<h1>" + e.getMessage() + "</h1>");
		}

		// Here also provide wnat to seee hyper link show data in registeraton page
		printWriter.println("<a href='home.html' style='text-align:center'>Home</a>");
		printWriter.println("<br>");
		printWriter.println("<a href='booklist'>Book List</a>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp); // this method will call at time dopost method
	}

}
