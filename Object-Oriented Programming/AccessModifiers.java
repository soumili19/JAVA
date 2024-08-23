package objectOrientedProgramming;

class MyEmployee{
	private int id;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name=n;
	}
	
	public void setId(int i) {
		id=i;
	}
	
	public int getId() {
		return id;
	}
	
	
}
public class AccessModifiers {

	public static void main(String[] args) {
		MyEmployee harry=new MyEmployee();
		//harry.id=20;
		//harry.name="CodeWithHarry";--> throws and error because we cannot access the private from object calling 
		harry.setName("CodeWithHarry");
		System.out.println(harry.getName());
		harry.setId(20);
		System.out.println(harry.getId());
	}

}
