package objectOrientedProgramming;

class MyCylinder2{
	
	private int radius;
	private int height;
	public double pi;
	
	public MyCylinder2() {
		radius=20;
		height=12;
	}
			
	public double area() {
		return 2*radius*height*pi+2*pi*radius*radius;
	}
	
	public double vloume() {
		return pi*radius*radius*height;
	}
}

public class UsingConstructorCalculateCylinder {

	public static void main(String[] args) {
		 MyCylinder2 c1 = new MyCylinder2();
		 c1.pi=3.14;
		 System.out.println(c1.area());
		 System.out.println(c1.vloume());
		 
	}

}
