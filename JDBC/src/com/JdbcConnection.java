package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	
	
	
	    public static void main(String[] args) {
	        Connection connection = null;

	        try {
	            // Register the MySQL JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // MySQL database URL
	            String url = "jdbc:mysql://localhost:3306/coreproject";

	            // Database credentials
	            String username = "root";
	            String password = "root";

	            // Establish the connection
	            connection = DriverManager.getConnection(url, username, password);

	            if (connection != null) {
	                System.out.println("Connected to the database!");
	                // Perform database operations here
	            } else {
	                System.out.println("Failed to connect to the database!");
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (connection != null) {
	                    connection.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}



