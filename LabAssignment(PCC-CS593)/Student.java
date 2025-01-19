package assignment;

public class Student {
	    private int roll;
	    private String name;
	    private String course;
	    private int[] marks = new int[5];

	    public Student(int roll, String name, String course, int[] marks) {
	        this.roll = roll;
	        this.name = name;
	        this.course = course;
	        this.marks = marks;
	    }

	    public int getRoll() { return roll; }
	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }
	    public String getCourse() { return course; }
	    public void setCourse(String course) { this.course = course; }
	    public int[] getMarks() { return marks; }
	    public void setMarks(int[] marks) { this.marks = marks; }

	    public double calculateStudentAverage() {
	        int total = 0;
	        for (int mark : marks) {
	            total += mark;
	        }
	        return total / 5.0;
	    }
	}


