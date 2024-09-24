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
@WebServlet("/editScreen")
public class EditScreenServlet extends HttpServlet {
	private static final String query = "select bookName,bookEdition,bookPrice from books where bookId=?";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// getPrintwriter
		PrintWriter printWriter = resp.getWriter();
		// set content type
		resp.setContentType("text/html");
		
		//get id from record pass in booklist (href='editScreen?bookId')
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
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			//hence pass in action bookId from getParameter as request
			printWriter.println("<form action='editUrl?bookId="+bookId+"' method='post'>");
			
			printWriter.println("<table align='center'>");
			printWriter.println("<tr>");
			printWriter.println("<td>Book Name </td>");
			printWriter.println("<td><input type='text' name='bookName' value='"+resultSet.getString(1)+"'></td>");
			printWriter.println("</tr>");
			printWriter.println("<tr>");
			printWriter.println("<td>Book Edition </td>");
			printWriter.println("<td><input type='text' name='bookEdition' value='"+resultSet.getString(2)+"'></td>");
			printWriter.println("</tr>");
			printWriter.println("<tr>");
			printWriter.println("<td>Book Price </td>");
			printWriter.println("<td><input type='text' name='bookPrice' value='"+resultSet.getFloat(3)+"'></td>");
			printWriter.println("</tr>");
			printWriter.println("<tr>");
			printWriter.println("<td><input type='submit' value='Edit'></td>");
			printWriter.println("<td><input type='reset' value='Cancel'></td>");
			printWriter.println("</tr>");
			printWriter.println("</table>");
			printWriter.println("</form>");
			
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


	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp); // this method will call at time dopost method
	}


}
