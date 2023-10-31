package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.w3c.dom.ls.LSOutput;

import DAO.DAOUser;
import bean.UserBean;

public class UserMain {
	public static void main(String[] args) throws SQLException {
		DAOUser du=new DAOUser();
		String s1=du.getUserType("TA1002");
		System.out.println(s1);
		String s2=du.getIncorrectAttempts("AB1001");
		System.out.println(s2);
		String s3=du.changeUserType("TA1002");
		System.out.println(s3);
		int a=du.getLockStatus();
		System.out.println(a);
		String s4=du.changeName("TA1002", "Akhil");
		System.out.println(s4);
		String s5=du.changePassword("Abhi123");
		System.out.println(s5);
		UserBean ub=new UserBean("AB1003","AB1003","Abhinav",0,0,"Admin");
		String s6=du.addUser_1(ub);
		System.out.println(s6);
		UserBean ub2=new UserBean("AB1004","AB1004","Arun",0,0,"Employee");
		String s7=du.addUser_2(ub2);
		System.out.println(s7);
		ArrayList<UserBean> a1=du.getUsers("Admin");
		
	    a1.get(0).display();
		
		
		ArrayList<UserBean> a2=du.storeAllRecords();
		a2.get(1).display();
		a2.get(2).display();
		
		String[] arr=du.getNames();
		System.out.println(Arrays.toString(arr));
		
		
	}
}
