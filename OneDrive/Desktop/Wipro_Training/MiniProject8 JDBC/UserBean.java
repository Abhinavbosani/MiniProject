package bean;

public class UserBean {

	private String UserID;
	private String password;
	private String name;
	private int incorrectAttempts;
	private int lockstatus;
	private String usertype;
	public UserBean(String UserID,String password,String name,int incorrectAttempts,
			int lockstatus,String usertype) {
		// TODO Auto-generated constructor stub
		this.UserID=UserID;
		this.password=password;
		this.name=name;
		this.incorrectAttempts=incorrectAttempts;
		this.lockstatus=lockstatus;
		this.usertype=usertype;
	}
	public String getUserID() {
		return UserID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	
	public int getIncorrectAttempts() {
		return incorrectAttempts;
	}
	
	public int getLockstatus() {
		return lockstatus;
	}
	
	public String getUsertype() {
		return usertype;
	}
	public void display() {
		System.out.println("------------------------");
		System.out.println("UserID="+this.UserID);
		System.out.println("password="+this.password);
		System.out.println("Name="+this.name);
		System.out.println("IncorrectAttempts="+this.incorrectAttempts);
		System.out.println("local status="+this.lockstatus);
		System.out.println("UserType="+this.usertype);
		
		
		
	}
	
	
	
	
	
}
