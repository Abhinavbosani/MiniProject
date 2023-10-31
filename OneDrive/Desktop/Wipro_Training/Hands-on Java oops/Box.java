package wipro;

public class Box {
	private double height;
	private double depth;
	private double width;
	

	public Box(double height, double depth, double width) {
		super();
		this.height = height;
		this.depth = depth;
		this.width = width;
		
	}
	


	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getDepth() {
		return depth;
	}



	public void setDepth(double depth) {
		this.depth = depth;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}
	double volume() {
		double v=height*depth*width;
		return v;
		
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10,15,20);
		double ans=b.volume();
		System.out.println(ans);
		

	}

}
