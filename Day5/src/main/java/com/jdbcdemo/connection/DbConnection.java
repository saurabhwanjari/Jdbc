package com.jdbcdemo.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbConnection {
	public static Connection getDatabaseConnection() {
		try {
			Class.forName(DbDetails.DBDRIVER);
			Connection con = DriverManager.getConnection(
			DbDetails.dbURL, DbDetails.USERNAME, DbDetails.PASSWORD);
			System.out.println("connected..........");
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
