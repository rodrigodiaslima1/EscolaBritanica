package com.tvc.dao.generic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	// Connection is an interface
	private static Connection connection;
	
	private ConnectionFactory(Connection connection) {}
	
	public static Connection getConnection() throws SQLException{
		if(connection == null) {
			connection = initConnection();
		} else if(connection != null && connection.isClosed()) {
			connection = initConnection();
		}
		return connection;
	}
	
	/*
	 * Credentials:
	 * 
	 */
	private static Connection initConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/teste",
					"postgres",
					"f2ecbar1"
					);
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
