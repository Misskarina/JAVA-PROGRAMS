package core.java;

/**
 *
 * @author MISS KARINA
 */
public class Student {
    // Fields (data members)
    int rollNumber;
    String name;

    // Method to display student details
    void displayInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }

    // Main method to create objects
    public static void main(String[] args) {
        // Creating an object of Student class
        Student student1 = new Student();

        // Assigning values to the object's fields
        student1.rollNumber = 101;
        student1.name = "Karina Kumari";

        // Calling method using the object
        student1.displayInfo();
    }
}


