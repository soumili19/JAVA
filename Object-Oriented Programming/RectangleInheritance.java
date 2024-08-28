package objectOrientedProgramming;

class Rectangle2{
	public int length;
	public int width;
	
	Rectangle2(){
		System.out.println("I am a noperm constructor of rectangle");
	}
	
	Rectangle2(int l,int w){
		this.length=l;
		this.width=w;
		System.out.println("I am a parameterized constructor of rectangle");
	}
	
	
	public int area() {
		return this.length*this.width;
	}
	
}

class Cuboid extends Rectangle{
	public int heigth;
	
	Cuboid(int h){
		this.heigth=h;
		System.out.println("I am a noperm constructor of cuboid");
	}
	
	public int volume() {
		return this.length*this.width*this.heigth;
	}
}	
	
public class RectangleInheritance {

	public static void main(String[] args) {
		Rectangle2 r = new Rectangle2(5,6);
		Cuboid c = new Cuboid(4);
		System.out.println(r.area());
		System.out.println(c.volume());
		
		

	}

}
