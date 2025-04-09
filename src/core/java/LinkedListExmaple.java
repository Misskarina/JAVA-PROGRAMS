package core.java;
import java.util.LinkedList;
/**
 *
 * @author MISS KARINA
 */
public class LinkedListExmaple {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> cities = new LinkedList<>();

        // Add elements to the LinkedList
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Kolkata");

        // Display the list
        System.out.println("Cities in the list:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Add element at the beginning and end
        cities.addFirst("Chennai");
        cities.addLast("Hyderabad");

        // Display after adding at first and last
        System.out.println("\nAfter adding at beginning and end:");
        System.out.println(cities);

        // Remove elements
        cities.remove("Mumbai");         // By value
        cities.removeFirst();           // First element
        cities.removeLast();            // Last element

        // Check for element
        boolean hasDelhi = cities.contains("Delhi");
        System.out.println("\nContains Delhi? " + hasDelhi);

        // Display final list
        System.out.println("\nFinal list of cities:");
        System.out.println(cities);
    }
}

