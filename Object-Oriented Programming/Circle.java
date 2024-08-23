package objectOrientedProgramming;
public class Circle {
	 int r;
	 double pi;
	  
	 public double area() {
		 return (pi*r);
	 }
	  
	public double perimeter() {
		
		return (2*pi*r);
	}
	 
	public static void main(String[] args) {
	Circle c1=new Circle();
	c1.r=5;
	c1.pi=3.14;
	System.out.println(c1.area());
	System.out.println(c1.perimeter());
	
	

	}

}
