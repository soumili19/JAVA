package Basicinjava;
import java.util.Scanner;
public class ThreeAddition {

    int a,b,c;
    void input() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number");
        a=sc.nextInt();
        System.out.print("Enter the 2nd number");
        b=sc.nextInt();
        System.out.print("Enter the 3rd number");
        c=sc.nextInt();
        
    }
void display() {
    int sum=a+b+c;
    System.out.println("The sum of"+sum);
                
    }
    public static void main(String[] args) {
      ThreeAddition obj=new ThreeAddition();
      obj.input();
      obj.display();

    }

}