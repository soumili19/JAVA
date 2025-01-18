/*Design a class Time which contains hour, minute and second as instance variables. The class
should have the methods to support the following:
1. A Constructor to initialize instance variables with values.
2. A Constructor to initialize instance variables with default values.
3. Take the time as input in 24-hour format.
4. Display the time in AM/PM format.*/

package practiceLab;

import java.util.Scanner;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(){
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	void inputTime() {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter hour (0-23): ");
	        this.hour = sc.nextInt();
	       
	     System.out.println("Enter minute (0-59): ");
	     	this.minute = sc.nextInt();
	     	
	     System.out.println("Enter second (0-59): ");
		     this.second = sc.nextInt();	
	     
		  if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
		            System.out.println("Invalid time input. Setting to default (00:00:00).");
		            this.hour = 0;
		            this.minute = 0;
		            this.second = 0;
		
	       }
	}
	public void displayTime() {
        String period = (hour < 12) ? "AM" : "PM";
        int displayHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        System.out.printf("Time in AM/PM format: %02d:%02d:%02d %s%n", displayHour, minute, second, period);
    }

    public void display24HourFormat() {
        System.out.printf("Time in 24-hour format: %02d:%02d:%02d%n", hour, minute, second);
    }
}



