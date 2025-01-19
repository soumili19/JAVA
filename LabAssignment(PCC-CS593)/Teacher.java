package assignment;
public class Teacher extends Person {
 private String subject;
 private String employeeId;

 public Teacher(String name, int age, String subject, String employeeId) {
     super(name, age);  
     this.subject = subject;
     this.employeeId = employeeId;
 }

 public String getSubject() { return subject; }
 public String getEmployeeId() { return employeeId; }

 public String toString() {
     return super.toString() + ", Subject: " + subject + ", Employee ID: " + employeeId;
 }
}
