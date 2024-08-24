package objectOrientedProgramming;

class Rectangle1{
	int length;
	int breadth;
	
    public Rectangle1() {
    	length=4;
    	breadth=5;
    }
    
    public Rectangle1(int length,int breadth) {
    	this.length = length;
    	this.breadth = breadth;
    }
    
    public int getLength() {
    	return length;
    }
    
    public int getBreadth() {
    	return breadth;
    }
    
	
    
}

public class CalculateRectangle {

	public static void main(String[] args) {
		Rectangle1 r1 = new Rectangle1(12,56);
		System.out.println(r1.getLength());
		System.out.println(r1.getBreadth());
		
	}

}
