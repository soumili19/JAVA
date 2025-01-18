
package practiceLab;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
        Calculator obj = new Calculator(); 
        
        
        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("The result of adding two numbers is " + obj.add(num1, num2));
        System.out.println("The result of adding multiplication two  numbers is " + obj.mul(num1, num2));

       
        System.out.print("Enter three numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("The result of adding three numbers is " + obj.add(num1, num2, num3));
        System.out.println("The result of multiplication three numbers is " + obj.mul(num1, num2, num3));
       
        System.out.print("Enter four numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        System.out.println("The result of adding four numbers is " + obj.add(num1, num2, num3, num4));
        System.out.println("The result of multiplication four numbers is " + obj.mul(num1, num2, num3, num4));
        
        scanner.close();
		
	}

}
