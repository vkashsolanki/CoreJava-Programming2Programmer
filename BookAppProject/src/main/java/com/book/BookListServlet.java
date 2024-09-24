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

@WebServlet("/booklist")
public class BookListServlet extends HttpServlet {

	private static final String query = "select bookId,bookName,bookEdition,bookPrice from books";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// getPrintwriter
		PrintWriter printWriter = resp.getWriter();
		// set content type
		resp.setContentType("text/html");

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
			// execute the query
			ResultSet resultset = statement.executeQuery();
			// create table show heading
			printWriter.println("<table border='1' align='center'>");
			printWriter.println("<tr>");
			printWriter.println("<th>Book Id</th>");
			printWriter.println("<th>Book Name</th>");
			printWriter.println("<th>Book Edition</th>");
			printWriter.println("<th>Book Price</th>");
			
			printWriter.println("<th>Edit</th>");
			printWriter.println("<th>Delete</th>");
			
			printWriter.println("</tr>");

			while (resultset.next()) {
				// // create table show data
				printWriter.println("<tr>");
				printWriter.println("<td>" + resultset.getInt(1) + "</td>");
				printWriter.println("<td>" + resultset.getString(2) + "</td>");
				printWriter.println("<td>" + resultset.getString(3) + "</td>");
				printWriter.println("<td>" + resultset.getFloat(4) + "</td>");
				//url is editScreen
				printWriter.println("<td><a href ='editScreen?bookId="+resultset.getInt(1)+"'>Edit</a></td>");
				printWriter.println("<td><a href ='deleteUrl?bookId="+resultset.getInt(1)+"'>Delete</a></td>");
				printWriter.println("<td><a> </a></td>");
				
				printWriter.println("</tr>");
			}
			printWriter.println("</table>");

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
