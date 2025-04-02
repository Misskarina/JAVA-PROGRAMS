package core.java;

/**
 *
 * @author MISS KARINA
 */
public class Variables {
    // Instance variable (belongs to an object)
    int instanceVar = 20;

    // Static variable (belongs to class)
    static int staticVar = 50;

    public void display() {
        // Local variable (declared inside a method)
        int localVar = 10;
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        // Creating an object of the class
        Variables obj = new Variables();
        obj.display();
    }
}

   
