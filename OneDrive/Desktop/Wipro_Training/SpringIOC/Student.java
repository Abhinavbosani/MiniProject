package SpringIOC;

public class Student {
	private String sid;
	private String sname;
	private Test sTest;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Test getsTest() {
		return sTest;
	}
	public void setsTest(Test sTest) {
		this.sTest = sTest;
	}
	public Student(String sid, String sname, Test sTest) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sTest = sTest;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sTest=" + sTest + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
