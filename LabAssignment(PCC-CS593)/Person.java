/*You have to develop one application for managing Students and Teachers information. They
have some common property, hence you have to define a class Person. Design the application
maintaining hierarchy of classes. Override the toString method to print the values of an object.
The students and teachers information should be kept using array of objects.*/

package assignment;

public class Person {
	private String name;
    private int age;

  
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
    public String getName() { return name; }
    public int getAge() { return age; }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}


