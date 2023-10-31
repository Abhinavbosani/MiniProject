package service;

import DAO.DAOClass;
import UtilityClasses.ConnectionUtil;

public class JDBCCalls {
	public static void main(String[] args) {
		ConnectionUtil cUtil=new ConnectionUtil();
		DAOClass daoClass=new DAOClass();
		System.out.println("--------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.Update");
		System.out.println("4.Display");
		System.out.println("--------------------------");
		System.out.println("Give your option as command line first Argument ");
		
		int value=Integer.parseInt(args[0]);
		switch (value) {
		case 1: String[] arr= {args[0],args[1],args[2],args[3],args[4],args[5]};
		        daoClass.insert(arr);
		        break;
		case 2: daoClass.delete(Integer.parseInt(args[1])); 
		        break;
		case 3:daoClass.update(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
		        break;
		case 4: daoClass.display(Integer.parseInt(args[1]));    
		        break;
		
		
			
			
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + args[0]);
		}
		}
		
	}


