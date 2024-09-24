package com.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LibFunction {

	public static void callIssueMenu() {

		System.out.println("Reahcehd Book inside Issue");
		Member member = new Member();
		Book book = new Book();

		Scanner sc = new Scanner(System.in);

		int addStatus = 0;

		while (addStatus == 0) {
			try {
				System.out.println("Enter the member id");
				// set datamemeber to object refrence for user input
				member.setMemberId(Integer.parseInt(sc.nextLine().toString()));
				System.out.println("Enter the isbc code");
				book.setIsbnCode(sc.nextLine().toString());

				// pass as onejct in addBook parametrize method
				issueBook(member, book);
				addStatus = 1;

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				addStatus = 0;

			}

		}

	}

	private static void issueBook(Member member, Book book) {

		try {

			Connection connection = LibUtil.getConnection();

			Statement statement = connection.createStatement();

			ResultSet rs = null;

			String qry = "select member.memberId, book.isbnCode, mbr.recId from members member, books book, memberbookrecord mbr\n"
					+ "where member.memberId= " + member.getMemberId() + " \n" + "and book.isbnCode = '"
					+ book.getIsbnCode() + "' \n" + "and member.memberId=mbr.membersId\n"
					+ "and book.isbnCode=mbr.isbnCode and mbr.dor is null ";
			rs = statement.executeQuery(qry);
			if (rs.next()) {
				System.out.println("The book is already issued and cannot be issued again");
			} else {
				int k = statement.executeUpdate("insert into memberbookrecord values(" + member.getMemberId() + ",'"
						+ book.getIsbnCode() + "',SYSDATE(),null)");
				if (k > 0) {
					k = statement.executeUpdate("update books set unitAvailable= (unitAvailable-1) where isbCode = '"
							+ book.getIsbnCode() + "' ");
					connection.commit();
					System.out.println("The book is issued successfully");
				} else {
					connection.rollback();
				}
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void callReturnMenu() {

		System.out.println("Reahcehd inside return book menu");
		Member member = new Member();
		Book book = new Book();

		Scanner sc = new Scanner(System.in);

		int addStatus = 0;

		while (addStatus == 0) {
			try {
				System.out.println("Enter the member id");
				// set datamemeber to object refrence for user input
				member.setMemberId(Integer.parseInt(sc.nextLine().toString()));
				System.out.println("Enter the isbc code");
				book.setIsbnCode(sc.nextLine().toString());

				// pass as onejct in addBook parametrize method
				returnBook(member, book);
				addStatus = 1;

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				addStatus = 0;

			}

		}

	}

	private static void returnBook(Member member, Book book) throws ClassNotFoundException, SQLException, IOException {

		
				
				Connection connection = LibUtil.getConnection();
				try {
				Statement statement = connection.createStatement();
				
				ResultSet rs = null;
				Integer recId=rs.getInt(3);
				
				String qry = "select member.memberId, book.isbnCode, mbr.recId from members member, books book, memberbookrecord mbr\n"
		                + "where member.memberId= " + member.getMemberId() + " \n"
		                + "and book.isbnCode = '" + book.getIsbnCode() + "' \n"
		                + "and member.memberId=mbr.membersId\n"
		                + "and book.isbnCode=mbr.isbnCode and mbr.dor is null ";
		        rs=statement.executeQuery(qry);
		        if (rs.next()) {
		        	//Integer recId=rs.getInt(3);
		            System.out.println("The book is already issued and starting to process return");
		            int k = k = statement.executeUpdate("update books set unitAvailable= (unitAvailable+1) where isbCode = '"+ book.getIsbnCode() +"' ");
		            if(k > 0){
		            	 k = statement.executeUpdate("update  memberbookrecord set dor= sysdate() where recId="+ recId +" "); 
		                connection.commit();
		                System.out.println("The book is return successfully");
		            }else{
		            	connection.rollback();
		            }
		            
		            }else
		            {
		            	System.out.println("This book not issue for the User");
		            
				}
		             
				connection.close();
		 
				
			}catch(

	Exception e)
	{
		e.printStackTrace();

	}

}
}
