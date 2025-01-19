package assignment;

public class Test8 {
	    public static void main(String[] args) {
	        StudentManager manager = new StudentManager();

	        manager.addStudent(1, "Alice", "Math", new int[]{85, 90, 78, 92, 88});
	        manager.addStudent(2, "Bob", "Science", new int[]{75, 80, 68, 82, 77});

	        manager.modifyStudent(1, "Alice Brown", "Math", new int[]{88, 92, 85, 95, 90});

	        manager.displayStudentAverages();
	      
	        manager.calculateSubjectAverages();

	        manager.deleteStudent(2);
	    }
	}


