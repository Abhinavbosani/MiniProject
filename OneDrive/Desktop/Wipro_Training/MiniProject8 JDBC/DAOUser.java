package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import UtilityClasses.UserConnect;
import bean.UserBean;

public class DAOUser {
	UserConnect uConnect=new UserConnect();
	Connection conn=null;
	Statement stmt;
	PreparedStatement pstmt=null;
	PreparedStatement pstmt2;
	ResultSet rSet=null;
	ResultSet rSet2=null;
	
	
	
  public String getUserType(String userID) throws SQLException {
		String usertype=null;
		try {
			conn=(Connection) uConnect.getDBConnection();
		
		stmt=(Statement) conn.createStatement();
		rSet=((java.sql.Statement) stmt).executeQuery("select usertype from userinfo where userID='"+userID+"'");
		if (rSet.next()) {
			usertype=rSet.getString("userType");
			
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usertype;
		
	}
	public String getIncorrectAttempts(String userID) throws SQLException {
		int a=0;
		try {
			conn=uConnect.getDBConnection();
		
		stmt=(Statement) conn.createStatement();
		rSet=((java.sql.Statement) stmt).executeQuery("select IncorrectAttempts from userinfo where userID='"+userID+"'");
		if(rSet.next()) {
			a=rSet.getInt("IncorrectAttempts");
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		int a=rSet.getInt("IncorrectAttempts");
		if (a==0) {
			return "No Incorrect Attempt";
			
		}
		else if (a==1) {
			return "One Time";
			
		}
		else {
			return "Incorrect Attempt Exceede";
		}
		
	}
	public String changeUserType(String userID) throws SQLException {
		int b=0;
		try {
		conn=uConnect.getDBConnection();
		
		stmt=(Statement) conn.createStatement();
		b=((java.sql.Statement) stmt).executeUpdate("update UserInfo set usertype='Admin' where userID='"+userID+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (b>1) {
			return "Update Success";
			
		}
		
		else {
			return "Update Failed";
		}
		
	}
	public int getLockStatus() throws SQLException {
		int b=0;
		try {
		conn=uConnect.getDBConnection();
		
		stmt=(Statement) conn.createStatement();
		rSet=((java.sql.Statement) stmt).executeQuery("select count(*) from userinfo where lockstatus=0");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (rSet.next()) {
			
		
		b= rSet.getInt(1);
		}
		return b;
		
		
	}
	public String changeName(String userID,String name) throws SQLException {
	    boolean b=false;
		try {
		conn=	uConnect.getDBConnection();
		
		stmt=(Statement) conn.createStatement();
		b=((java.sql.Statement) stmt).execute("update UserInfo set name='"+name+"'"+" where userID='"+userID+"'");
		b=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (b) {
			return "Success";
			
		}
		
		else {
			return "Failed";
		}
		

}
	public String changePassword(String password) throws SQLException {
	    boolean b=false;
		try {
		conn=	uConnect.getDBConnection();
		
		stmt=(Statement) conn.createStatement();
		b=((java.sql.Statement) stmt).execute("update UserInfo set password='"+password+"'"+" where usertype='Admin'");
		b=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (b) {
			return "Success";
			
		}
		
		else {
			return "Failed";
		}
		

}
public String addUser_1(UserBean bean) throws SQLException {
		boolean b=false;
		
		try {
			conn=uConnect.getDBConnection();
			pstmt=conn.prepareStatement("insert into userinfo values(?,?,?,?,?,?)");
			pstmt.setString(1,bean.getUserID());
			pstmt.setString(2,bean.getPassword());
			pstmt.setString(3, bean.getName());
			pstmt.setInt(4,bean.getIncorrectAttempts());
			pstmt.setInt(5, bean.getLockstatus());
			pstmt.setString(6,bean.getUsertype());
			pstmt.executeQuery();
			b=true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		if (b) {
			return "Success";
			
		}
		
		else {
			return "Fail";
		}
		

}
public String addUser_2(UserBean bean) throws SQLException {
	boolean b=false;
	if(bean.getLockstatus()==0) {
	try {
	conn=uConnect.getDBConnection();
		pstmt=conn.prepareStatement("insert into userinfo values(?,?,?,?,?,?)");
		pstmt.setString(1,bean.getUserID());
		pstmt.setString(2,bean.getPassword());
		pstmt.setString(3, bean.getName());
		pstmt.setInt(4,bean.getIncorrectAttempts());
		pstmt.setInt(5, bean.getLockstatus());
		pstmt.setString(6,bean.getUsertype());
		pstmt.executeQuery();
		b=true;
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	}
	
	if (b) {
		return "Success";
		
	}
	
	else {
		return "Fail";
	}
	

}
public ArrayList<UserBean> getUsers(String usertype) throws SQLException{
	try {
	conn=	uConnect.getDBConnection();
	
	stmt=(Statement) conn.createStatement();
	rSet=((java.sql.Statement) stmt).executeQuery("select * from userinfo where usertype='"+usertype+"'");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	ArrayList<UserBean> aList=new ArrayList<>();
	while (rSet.next()) {
        String userID = rSet.getString("UserID");
        String password = rSet.getString("password");
        String name = rSet.getString("name");
        int incorrectAttempts = rSet.getInt("incorrectAttempts");
        int lockStatus = rSet.getInt("lockstatus");
        String userType = rSet.getString("usertype");

        UserBean userBean = new UserBean(userID, password, name, incorrectAttempts, lockStatus, userType);
        aList.add(userBean);
        
    }
	return aList;
	
	
}
public ArrayList<UserBean> storeAllRecords() throws SQLException{
	try {
	conn=	uConnect.getDBConnection();
	
	stmt=(Statement) conn.createStatement();
	rSet=((java.sql.Statement) stmt).executeQuery("select * from userinfo");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	ArrayList<UserBean> aList=new ArrayList<>();
	while (rSet.next()) {
        String userID = rSet.getString("UserID");
        String password = rSet.getString("password");
        String name = rSet.getString("name");
        int incorrectAttempts = rSet.getInt("incorrectAttempts");
        int lockStatus = rSet.getInt("lockstatus");
        String userType = rSet.getString("usertype");

        UserBean userBean = new UserBean(userID, password, name, incorrectAttempts, lockStatus, userType);
        aList.add(userBean);
        
    }
	return aList;
	
	
}
public String[] getNames() throws SQLException {
	String[] strings=null;
	int rc=0;
	try {
	conn=	uConnect.getDBConnection();
	PreparedStatement preparedStatement=conn.prepareStatement("select name from userinfo");
	
	PreparedStatement preparedStatement2=conn.prepareStatement("select * from userinfo");
	ResultSet rs=preparedStatement.executeQuery();
	rc=preparedStatement2.executeUpdate();
	System.out.println(rc);
//	pstmt2=conn.("select count(*) from userinfo");
//	rSet2=pstmt.executeQuery();
	
	
//	if(rSet2.next()) {
//	  d=rSet2.getInt(1);
//	}
	strings=new String[rc];
	int i=0;
	while (rs.next()) {
		String nameString;
		nameString=rs.getString("name");
		strings[i]=nameString;
		i++;
	
	}
} catch (SQLException e) {
	e.printStackTrace();
}
//	System.out.println(Arrays.toString(strings));
	
      return strings;
	}
}
