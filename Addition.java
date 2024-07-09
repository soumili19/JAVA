package Addition;

import java.util.Scanner;

public class Addition {
    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        b = sc.nextInt();
       
    }

    void display() {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.input();
        obj.display();
    }
}
