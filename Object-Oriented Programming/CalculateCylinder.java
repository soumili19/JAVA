package objectOrientedProgramming;
class MyCylinder1{
	
	private int radius;
	private int height;
	public double pi;
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int n) {
		radius=n;
		
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int m) {
		height=m;
	}
	
	public double area() {
		return 2*radius*height*pi+2*pi*radius*radius;
	}
	
	public double vloume() {
		return pi*radius*radius*height;
	}
}

public class CalculateCylinder {

	public static void main(String[] args) {
		MyCylinder1 c1 = new MyCylinder1();
		c1.pi=3.14;
		c1.setRadius(20);
		System.out.println(c1.getRadius());
		c1.setHeight(12);
		System.out.println(c1.getHeight());
		System.out.println(c1.area());
		System.out.println(c1.vloume());
		
		
		
	}

}
