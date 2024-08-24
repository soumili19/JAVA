package objectOrientedProgramming;
class MyCylinder{
	
	private int radius;
	private int height;
	
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
}

public class Cylinder {

	public static void main(String[] args) {
		MyCylinder c1 = new MyCylinder();
		c1.setRadius(20);
		System.out.println(c1.getRadius());
		c1.setHeight(12);
		System.out.println(c1.getHeight());
		
	}

}
