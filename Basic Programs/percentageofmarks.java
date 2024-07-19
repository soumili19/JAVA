package Basicinjava;
import java.util.Scanner;

public class percentageofmarks {
    int sub1, sub2, sub3, sub4, sub5, sum;
    float per;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the 1st subject:");
        sub1 = sc.nextInt();
        System.out.println("Enter the marks of the 2nd subject:");
        sub2 = sc.nextInt();
        System.out.println("Enter the marks of the 3rd subject:");
        sub3 = sc.nextInt();
        System.out.println("Enter the marks of the 4th subject:");
        sub4 = sc.nextInt();
        System.out.println("Enter the marks of the 5th subject:");
        sub5 = sc.nextInt();
    }

    void calculate() {
        sum = sub1 + sub2 + sub3 + sub4 + sub5;
        per = (sum / 500.0f) * 100; 
    }

    void display() {
        System.out.println("The percentage of marks is: " + per + "%");
    }

    public static void main(String[] args) {
        percentageofmarks obj = new percentageofmarks();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
