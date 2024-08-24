  package objectOrientedProgramming;

  class Base {
	  int x;
  
  public int getx() {
	  return x;
  }
  
  public void setx(int x) {
	  System.out.println("I am setting x now");
	  this.x=x;
  }
  
  public void printMe() {
	  System.out.println("I am a Method");
  }
  }
 class Derived extends Base{
	 int y;
	 
	 public int gety() {
		 return y;
	 }
	 
	 public void sety() {
		 this.y=y; 
	 }
 }
public class Inheritance {

	public static void main(String[] args) {
		//creating a object of base class
		Base b = new Base();
		b.setx(4);
		System.out.println(b.getx());
		
		//creating a object of derived class
		Derived d = new Derived();
		d.setx(43);
		System.out.println(d.getx());
		
		 
		

	}

}
