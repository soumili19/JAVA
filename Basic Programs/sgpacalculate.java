package Basicinjava;
import java.util.Scanner;
public class sgpacalculate {

	 public static void main(String arg[] ) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of the 1st subject");
			float sub1=sc.nextInt();
			System.out.println("Enter the number of the 2nd subject");
			float  sub2=sc.nextInt();
			System.out.println("Enter the number of the 3rd subject");
			float  sub3=sc.nextInt();
			float cgpa=(sub1+sub2+sub3)/30;
			System.out.println("The cgpa number is "+cgpa);
	 }
	 }

