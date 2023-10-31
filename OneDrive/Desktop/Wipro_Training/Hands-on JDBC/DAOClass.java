package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import UtilityClasses.ConnectionUtil;

public class DAOClass {
	Connection con=null;
	PreparedStatement stmt;
	ResultSet rSet;
	java.sql.Date date;
	public DAOClass() {
		con=ConnectionUtil.getConnection();
		
	
	}
	public void insert(String[] d) {
		int a=Integer.parseInt(d[1]);
		SimpleDateFormat format=new SimpleDateFormat("dd-MMM-yyyy");
		date=Date.valueOf(d[4]);
   
		int b=Integer.parseInt(d[5]);
		try {
			stmt=con.prepareStatement("insert into student values(?,?,?,?,?)");
			stmt.setInt(1, a);
			stmt.setString(2,d[2]);
			stmt.setString(3, d[3]);
			stmt.setDate(4,date);
			stmt.setInt(5, b);
			stmt.executeQuery();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public void update(int e,int fee) {
		try {
			stmt=con.prepareStatement("update student set fees=? where rollno=?");
			stmt.setInt(1, fee);
			stmt.setInt(2, e);
			stmt.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	public void delete(int c) {
		try {
			stmt=con.prepareStatement("delete from student where rollno=? ");
			stmt.setInt(1, c);
			stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void display(int d) {
		try {
			stmt=con.prepareStatement("Select * from student where rollno=?");
			stmt.setInt(1, d);
			rSet=stmt.executeQuery();
			while(rSet.next()) {
				System.out.println(rSet.getString("studentname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
