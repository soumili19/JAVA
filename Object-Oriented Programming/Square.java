package objectOrientedProgramming;
class square1{
	int side;
	
	public int area(){
		return side*side;
	}
	public int perimeter() {
		return 4*side;
	}
}

public class Square {

	public static void main(String[] args) {
		square1 s1=new square1();
		s1.side=5;
		System.out.println(s1.area());
		System.out.println(s1.perimeter());
		
		
	}

}
