package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public void dbConnect() throws SQLException, ClassNotFoundException {
		// Load the JDBC driver
		System.out.println("Driver loaded");
		// Establish a connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/EMS","root","");
		System.out.println("Database connected");
		// Create a statement
		Statement statement = connection.createStatement();
		connection.close();
		}
}
