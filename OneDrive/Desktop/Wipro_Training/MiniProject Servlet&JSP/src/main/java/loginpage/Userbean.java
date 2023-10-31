package loginpage;

public class Userbean {
	private String UserID;
	private String password;
	private Userbean(String userID, String password) {
		super();
		UserID = userID;
		this.password = password;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
