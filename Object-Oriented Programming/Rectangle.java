package objectOrientedProgramming;

public class Rectangle {
	int length;
	int width;
	
	public int area() {
		return length*width;
	}
	
	public int perimeter() {
		return 2*(length+width);
	}
	
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.length=15;
		r1.width=4;
		System.out.println(r1.area());
		System.out.println(r1.perimeter());

	}

}
