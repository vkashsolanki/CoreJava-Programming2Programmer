package com.user;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class LibUtil {

	public static Connection getConnection() throws SQLException, IOException, ClassNotFoundException {

		Connection conn = null;

		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("src/dbproperties");
			// load properties
			prop.load(fis);

			String driverName = prop.getProperty("driver");
			Class.forName(driverName);

			String url, user, password;
			url = prop.getProperty("url");
			user = prop.getProperty("username");
			password = prop.getProperty("password");

			// create connection
			conn = DriverManager.getConnection(url, user, password);

			System.out.println("Creating connecton" + conn);

			return conn;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return conn;
	}
}
