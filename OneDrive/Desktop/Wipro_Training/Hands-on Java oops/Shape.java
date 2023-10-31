package wipro;

public class Shape {
	public static void main(String[ ]args) {
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		t.draw();
		
	}

	
	void draw() {
		System.out.println("drawing shape");
		
	}

	void erase() {
		System.out.println("erase shape");
		
	}
}


class Triangle extends Shape{
	void draw() {
		System.out.println("drawing Traingle");
		
	}

	void erase() {
		System.out.println("erase Traingle");
	
}
}
class Circle extends Shape{
	
	void draw() {
		System.out.println("drawing Circle");
		
	}

	void erase() {
		System.out.println("erase circle");
}
}

class Square extends Shape{
	
	void draw() {
		System.out.println("drawing square");
		
	}

	void erase() {
		System.out.println("erase square");
}
}




	

