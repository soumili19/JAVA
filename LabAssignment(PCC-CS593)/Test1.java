
package practiceLab;

public class Test1 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("The result of this value is " + obj.add(2, 3));        
        System.out.println("The result of this value is " + obj.add(2, 3, 4));     
        System.out.println("The result of this value is " + obj.add(2, 3, 4, 5));  
        
        System.out.println("The result of this value is " + obj.mul(2, 3));        
        System.out.println("The result of this value is " + obj.mul(2, 3, 4));     
        System.out.println("The result of this value is " + obj.mul(2, 3, 4, 5)); 
    }
}
