package assignment;

public class Test4 {
 public static void main(String[] args) {
   
     Complex c1 = new Complex(3, 4);
     Complex c2 = new Complex(1, 2);

     System.out.println("Initial Complex numbers:");
     System.out.println("c1 = " + c1);
     System.out.println("c2 = " + c2);

     Complex sum = c1.add(c2);
     System.out.println("\nSum (c1 + c2): " + sum);

     Complex difference = c1.subtract(c2);
     System.out.println("Difference (c1 - c2): " + difference);

     Complex product = c1.multiply(c2);
     System.out.println("Product (c1 * c2): " + product);
 }
}
