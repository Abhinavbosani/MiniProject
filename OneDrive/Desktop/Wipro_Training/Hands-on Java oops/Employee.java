package Study;

public class Employee extends Person {
	double anSalary;
	int year;
	String insNum;
	public Employee(double anSalary, int year,String insNum) {
	     super("Abhinav");
	     
		
		
		this.anSalary = anSalary;
		this.year = year;
		this.insNum = insNum;
	}
	void display() {
//		System.out.println(salary);
		System.out.println(insNum);
		System.out.println(year);
		System.out.println(name);
		System.out.println(anSalary);
		
		
	}
	public double getAnSalary() {
		return anSalary;
	}
	public void setAnSalary(double anSalary) {
		this.anSalary = anSalary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsNum() {
		return insNum;
	}
	public void setInsNum(String insNum) {
		this.insNum = insNum;
	}

	

}
