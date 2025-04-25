package com.pms.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getDbConnection() {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infyni", "root", "root@123");
	return con;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}
}
