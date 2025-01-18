package practiceLab;

public class Test3 {

	public static void main(String[] args) {
		 Time defaultTime = new Time();
	        System.out.println("Default Time:");
	        defaultTime.display24HourFormat();
	        defaultTime.displayTime();
	        
	        Time specificTime = new Time(15, 30, 45);
	        System.out.println("\nSpecific Time:");
	        specificTime.display24HourFormat();
	        specificTime.displayTime();

	        Time userTime = new Time();
	        System.out.println("\nEnter Time:");
	        userTime.inputTime();
	        userTime.display24HourFormat();
	        userTime.displayTime();

	}

}
