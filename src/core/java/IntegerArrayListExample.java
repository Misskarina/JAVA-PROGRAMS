package core.java;
    import java.util.ArrayList;
import java.util.Collections;

public class IntegerArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add numbers to the list
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        // Display original list
        System.out.println("Original list: " + numbers);

        // Sort the list
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // Update a value at index 1
        numbers.set(1, 50);  // replaces 10 with 50
        System.out.println("After updating index 1: " + numbers);

        // Check if a number exists
        System.out.println("Contains 20? " + numbers.contains(20));

        // Remove by index
        numbers.remove(2);
        System.out.println("After removing index 2: " + numbers);

        // Get size of the list
        System.out.println("Size of list: " + numbers.size());

        // Clear the list
        numbers.clear();
        System.out.println("List after clear: " + numbers);
    }
}
