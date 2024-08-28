package objectOrientedProgramming;

class Phone{
	
	public void showTime() {
		System.out.println("Time is 8 am");
	}
	public void on() {
		System.out.println("Turing on Phone....");
	}
}

class SmartPhone extends Phone{
	public void music() {
		System.out.println("Playin music..");
	}
	public void on() {
		System.out.println("Turing on SmartPhone....");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		//Phone obj = new Phone();//Allowed
		//SmartPhone smobj = new SmartPhone();//Allowed
		//obj.on();
		
		Phone obj = new SmartPhone();//Allowed
		//SmartPhone obj2 = new Phone();// Not Allowed
		 obj.on();
		 
		
		
		
		

	}

}
