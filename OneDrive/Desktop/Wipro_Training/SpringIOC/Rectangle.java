package SpringIOC;

import org.springframework.stereotype.Component;

@Component
public class Rectangle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");
		
	}
	

}
