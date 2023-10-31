package wipro;

public class Question2 {

	public static void main(String[] args) {
	  Calculator c=new Calculator();
	  int a=c.powerInt(3, 3);
	  System.out.println(a);
	  int b=c.powerDouble(2,3);
	  System.out.println(b);
		

	}
	
}
class Calculator{
	static int powerInt(int num1,int num2) {
		// TODO Auto-generated method stub
		return (int) Math.pow(num1, num2);

	}
	static int powerDouble(double num1,int num2) {
		// TODO Auto-generated method stub
		return (int) Math.pow(num1, num2);

	}
	
     
	
}
