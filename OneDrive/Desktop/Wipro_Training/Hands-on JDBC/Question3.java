package wipro;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;

public class Question3 {
	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rSet;
		
	

		
	
	//Class.forName("oracle.jdbc.driver.OracleDriver");
	try {
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abhinav","root");
		System.out.println("Connection Established Successfully");
		stmt=(Statement) con.createStatement();
		rSet=((java.sql.Statement) stmt).executeQuery("select emp_id,first_name from employees");
		while(rSet.next()) {
			System.out.println(rSet.getInt(1)+"\t"+rSet.getString("first_name"));
		}
			
		
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
//		System.out.println("Connection could not be established");
	
	
	
	}
	
	}

}
