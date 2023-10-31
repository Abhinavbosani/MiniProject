package loginpage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
	
	public static Connection getConnection() {
		Connection c=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abhinav","root");
						
//			System.out.println("connected...");		
			
		} catch (ClassNotFoundException e) {
			
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return c;
	}
	

}
