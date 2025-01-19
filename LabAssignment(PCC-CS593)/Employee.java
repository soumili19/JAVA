/*Define a class Employee having private members – id, name, department, salary. Define default and parameterized constructors. Create a subclass called Manager with private member
bonus. Define methods display in both the classes. Create n objects of the Manager class and
display the details of the manager having the maximum total salary (salary+bonus*/



package assignment;
public class Employee {
	    private int id;
	    private String name;
	    private String department;
	    private double salary;

	    public Employee() {
	        id = 0;
	        name = "Unknown";
	        department = "Unknown";
	        salary = 0.0;
	    }

	    public Employee(int id, String name, String department, double salary) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	    }
	    
	    public double getSalary() {
	        return salary;
	    }

	    public void display() {
	        System.out.println("Employee ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: " + salary);
	    }
	}

