 package core.java;

import java.util.ArrayList;

/**
 *
 * @author MISS KARINA
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Display the list
        System.out.println("Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Get an element by index
        System.out.println("\nFruit at index 2: " + fruits.get(2));  // Mango

        // Remove an element
        fruits.remove("Banana");

        // Check if an element exists
        boolean hasApple = fruits.contains("Apple");
        System.out.println("\nContains Apple? " + hasApple);

        // Size of ArrayList
        System.out.println("Number of fruits: " + fruits.size());
    }
}

