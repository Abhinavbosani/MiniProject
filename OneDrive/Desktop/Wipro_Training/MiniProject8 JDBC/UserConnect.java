package UtilityClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserConnect {
	public Connection getDBConnection() {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abhinav","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
		
	}

}
