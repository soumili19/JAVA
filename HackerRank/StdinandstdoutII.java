package HackerRank;
import java.util.Scanner;
public class StdinandstdoutII {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine(); //thats check the text with space 
        String s= scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
