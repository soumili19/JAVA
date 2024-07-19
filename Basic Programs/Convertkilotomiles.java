package Basicinjava;
import java.util.Scanner;
public class Convertkilotomiles {

	public static void main(String[] args) {
	System.out.println("Enter the distance in kilometers");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 double m=0.621371*n;
	 System.out.println("The convert kilometer to miles");
	 System.out.println(m);
	}

}
