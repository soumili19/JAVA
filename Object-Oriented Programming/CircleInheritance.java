package objectOrientedProgramming;

class Circle1{
	 public int radius;
	 Circle1(){
		 System.out.println("I am a noparam  constructor of circle");
	 }
	 Circle1(int r){
		 System.out.println("I am circle1 paramterized constructor");
		 this.radius=r;
	 }
	 
	 public double area() {
		 
		 return Math.PI*this.radius*this.radius;
	 }
}

class Cylinder1 extends Circle1{
	public int height;
	
	Cylinder1(int r,int h){
		super(r);
		System.out.println("I am cylinder1 paramterized constructor");
		this.height=h;
	}
	public  double volume(){
		return Math.PI*this.radius*this.radius*this.height;
	}
}
public class CircleInheritance {

	public static void main(String[] args) {
		
		//Circle1 c1 = new Circle1(12);
		Cylinder1 c2 = new Cylinder1(12,4);
		

	}

}
