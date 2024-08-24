package objectOrientedProgramming;

class MyMainEmployee{
	private int id;
	private String name;

	public MyMainEmployee(){
		id = 0;
		name = "Your-Name-Here";	
	}
	
	public MyMainEmployee(String myName,int myId) {
		id = myId;
		name = myName;
	}
	
	public MyMainEmployee(String myName) {
		id = 1;
		name = myName;
	}
	
	public String getName(){
		return name;
	}
	
	public int getId() {
		return id;
	}
}	
public class Constructor {

	public static void main(String[] args) {
		MyMainEmployee harry=new MyMainEmployee("CodeWithHarry");
		System.out.println(harry.getId());
		System.out.println(harry.getName());
		

	}
}
