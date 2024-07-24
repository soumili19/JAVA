package Basicinjava;
import java.util.Scanner;

public class Calcuation_Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value for x: ");
        int x = sc.nextInt();
        float a = (x * 49 / 7.0f) + (35 / 70.0f);
        System.out.println(a);
    }
}
