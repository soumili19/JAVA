package assignment;
public class Manager extends Employee {
	    private double bonus;

	    public Manager() {
	        super(); 
	        bonus = 0.0;
	    }

	    public Manager(int id, String name, String department, double salary, double bonus) {
	        super(id, name, department, salary); 
	        this.bonus = bonus;
	    }

	    public double getBonus() {
	        return bonus;
	    }

	    public double totalSalary() {
	        return getSalary() + bonus;
	    }

	    public void display() {
	        super.display(); 
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Total Salary (Salary + Bonus): " + totalSalary());
	    }
	}

