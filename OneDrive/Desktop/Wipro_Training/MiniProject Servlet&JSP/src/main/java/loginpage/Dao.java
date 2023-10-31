package loginpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	Connection conn=null;
	Statement stmt;
	
	
	public String addUser(Userbean bean) throws SQLException {
		boolean b=false;
			PreparedStatement pstmt;		
			conn=Connections.getConnection();
			pstmt=conn.prepareStatement("insert into login values(?,?)");
			pstmt.setString(1,bean.getUserID());
			pstmt.setString(2,bean.getPassword());
			pstmt.executeQuery();
			b=true;
			
		if (b) 
			return "Success";
		else 
			return "Fail";	
	}
	public String changePassword(String password) throws SQLException {
	    int p;
		
		conn=Connections.getConnection();
		stmt=conn.createStatement();
		p=stmt.executeUpdate("update UserInfo set password='"+password+"' where usertype='Admin'");
		if (p>=1) 
			return "Changed";
		else 
			return "0";
	}
}
