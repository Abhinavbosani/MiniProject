package wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Question1 {
	public static void main(String[] args) {
		Connection con=null;
		
	

		
	
	try {
		Class c=Class.forName("oracle.jdbc.OracleDriver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abhinav","root");
		System.out.println("Connection Established Successfully");
	} catch (SQLException e) {
		
		e.printStackTrace();
		System.out.println("Connection could not be established");
	
	
	
	}
	
	}
}
