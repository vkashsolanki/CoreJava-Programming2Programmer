package com.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddMemberMenu {

	public static void addMemmberMenu() {

		System.out.println("Reached the add member  menu");

		// creating object of menu type
		Member member = new Member();

		Scanner sc = new Scanner(System.in);

		int addStatus = 0;

		while (addStatus == 0) {
			try {
				System.out.println("Enter the member id");
				// set datamemeber to object refrence for user input
				member.setMemberId(Integer.parseInt(sc.nextLine().toString()));
				System.out.println("Enter the member Name");
				member.setMemberName(sc.nextLine().toString());

				// pass as onejct in addBook parametrize method
				addMember(member);
				addStatus = 1;

			} catch (Exception e) {
				// TODO: handle exception
				addStatus = 0;

			}
		}

	}

	public static void addMember(Member member) throws SQLException, ClassNotFoundException, IOException {
		// get vlaued from Book Class's properties
		System.out.println("Reached inside value of add member menu has varable " + member.getMemberId());

		// making connection
		Connection conn = LibUtil.getConnection();
		try {
			Statement statement = conn.createStatement();
			int result = statement.executeUpdate("insert into members values('" + member.getMemberId() + "', '"
					+ member.getMemberName() + "',SYSDATE())");

			if (result > 0) {
				System.out.println("Added Member Menu Successfuly ");
				conn.commit();
			} else {
				conn.rollback();
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
