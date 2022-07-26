package com.cybage.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (Exception cause) {
			cause.printStackTrace();
			System.exit(1);		
		}
	}
	public static Connection getConnection( ) throws Exception {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/foodAppV2","root","root");
	}
}
