package objectOrientedProgramming;

class Employee{
	int id;
	String name;
	int salary;
	public void printDetails() {
		System.out.println("My id is" + id);
		System.out.println("My name is" + name);
	}	
	
	public int getSalary() {
		System.out.println("My salary is"+ salary);
		return salary;
	}
	
}

public class CreateClass {

	public static void main(String[] args) {
		System.out.println("This is our custom class");
		Employee harry=new Employee();//Instantiating a new Employee object
		Employee john=new Employee();//Instantiating a new Employee object
		
		//Setting Attributes
		harry.id=12;
		harry.name="CodeWithHarry";
		harry.salary=23;
		john.id=17;
		john.name="John Prasad";
		john.salary=18;
		
		//printing the Attributes
		harry.printDetails();
		harry.getSalary();
		john.printDetails();
		john.getSalary();
	}

}
