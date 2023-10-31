package SpringIOC;

public class Test {
	private String testId;
	private String testTitle;
	private int marks;
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestTitle() {
		return testTitle;
	}
	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Test(String testId, String testTitle, int marks) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testTitle=" + testTitle + ", marks=" + marks + "]";
	}
	

}
