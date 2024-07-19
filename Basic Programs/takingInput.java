package Basicinjava;
import java.util.Scanner;
public class takingInput {
	public static void main(String[] args) {
		System.out.println("Taking input from the user");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 1st number");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum is"+sum);
       
	}
	
}
