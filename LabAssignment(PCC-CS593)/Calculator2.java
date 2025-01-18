/*1.2 Question
Design a Calculator class having the following functions (using variable length of arguments):
1. addition for any number of inputs
2. multiplication for any number of inputs*/

package practiceLab;

public class Calculator2 {

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
	public int mul(int a, int b, int c) {
		return a * b * c;
	}
	public int mul(int a, int b, int c, int d) {
		return a * b * c * d;
	}
}
