package SpringIOC;

import org.springframework.stereotype.Component;

@Component
public class Triangle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Triangle");
		
	}

}
