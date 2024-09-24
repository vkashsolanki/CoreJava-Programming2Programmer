package com.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddBookMenu {

	public static void addBookMenu() {

		System.out.println("Reached the add book  menu");

		// creating object of Book type
		Book book = new Book();
		
		Scanner sc = new Scanner(System.in);

		int addStatus = 0;

		while (addStatus == 0) {
			try {
				System.out.println("Enter the isbn Code");
				// set datamemeber to object refrence for user input
				book.setIsbnCode(sc.nextLine().toString());
				System.out.println("Enter the Book Name");
				book.setBookName(sc.nextLine().toString());
				System.out.println("Enter the Book Description");
				book.setBookDesc(sc.nextLine().toString());
				System.out.println("Enter the Author Name ");
				book.setAuthorName(sc.nextLine().toString());
				System.out.println("Enter the Subject Name");
				book.setSubjectName(sc.nextLine().toString());
				System.out.println("Enter the Units Available");
				// book.setUnitAvailable(sc.nextInt());
				book.setUnitAvailable(Integer.parseInt(sc.nextLine().toString()));
				
				// pass as onejct in addBook parametrize method 
				addBook(book);
				addStatus = 1;
				
			} catch (Exception e) {
				// TODO: handle exception
				addStatus=0;
				
			}
		}
		
	}

	public static  void addBook(Book book) throws SQLException, ClassNotFoundException, IOException {
		// get vlaued from Book Class's properties
		System.out.println("Reached inside value of book has varable "+book.getIsbnCode());
		
		// making connection
		Connection conn = LibUtil.getConnection();
		try {
			Statement statement = conn.createStatement();
		int result = statement.executeUpdate("insert into books values('"+book.getIsbnCode()+"', '"+book.getBookName()+"'"
					+ ",'"+book.getBookDesc()+ "','"+book.getAuthorName()+"','"+book.getSubjectName()+ "',"
							+ "'"+book.getUnitAvailable()+ "')");
		
		if(result>0) {
			System.out.println("Added Book Successfuly ");
			conn.commit();
		}else {
			conn.rollback();
		}
		conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
