/*1.1 Question
Design a Calculator class having the following functions (using method overloading):
1. addition for (i) c = c1 + c2; (ii) c = c1 + c2 + c3; (iii) c = c1 + c2 + c3 + c4;
2. multiplication for (i) c = c1 * c2; (ii) c = c1 * c2 * c3; (iii) c = c1 * c2 * c3 * c4;*/

package practiceLab;

class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    public int mul(int a, int b) {
    	return a * b;
    }
    public int mul(int a ,int b, int c) {
    	return a * b * c;
    }
    public int mul(int a , int b, int c, int d) {
    	return a * b * c * d;
    }
}



