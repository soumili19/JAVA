package assignment;
import java.util.Scanner;
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of managers: ");
        int n = sc.nextInt();
        Manager[] managers = new Manager[n]; 

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Manager " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine(); 
            String name = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Bonus: ");
            double bonus = sc.nextDouble();

            managers[i] = new Manager(id, name, department, salary, bonus);
        }
    
        Manager maxManager = managers[0];
        for (int i = 1; i < n; i++) {
            if (managers[i].totalSalary() > maxManager.totalSalary()) {
                maxManager = managers[i];
            }
        }
        
        System.out.println("\nManager with the maximum total salary:");
        maxManager.display();
    }
}