package objectOrientedProgramming;
class Employee2{
	String name;
	int salary;
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name=n;
	}
}

public class Employee1 {

	public static void main(String[] args) {
		Employee2 harry=new Employee2();
		harry.setName("CodeWithHarry");
		harry.salary=233;
		System.out.println(harry.getSalary());
		System.out.println(harry.getName());

	}

}
