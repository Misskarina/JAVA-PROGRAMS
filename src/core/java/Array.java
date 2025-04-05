package core.java;

/**
 *
 * @author MISS KARINA
 */
public class Array {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Display array elements using a for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Calculate sum of array elements
        int sum = 0;
        for (int num : numbers) {  // Enhanced for loop
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
