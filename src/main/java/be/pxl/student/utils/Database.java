package be.pxl.student.utils;

import java.sql.*;

public class Database {

	private Connection connection;
	
	public Database(String url, String username, String password) throws SQLException {
		connection = DriverManager.getConnection(
				url + "?useSSL=false",
				username,
				password);
	}
	
	protected void closeConnection() throws SQLException {
		connection.close();
	}

	protected Connection getConnection() {
		return connection;
	}
	
}