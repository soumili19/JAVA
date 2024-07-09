package Factorial;
import java.util.Scanner;
public class Factorial {
    int fact, n;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the factorial: ");
        n = sc.nextInt();
    }
void Fact() {
        fact = 1; 
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
    }
    void display() {
        System.out.println("The factorial value is " + fact);
    }
    public static void main(String arg[] ) {
        Factorial obj = new Factorial();
        obj.input();
        obj.Fact();
        obj.display();
    }
}
