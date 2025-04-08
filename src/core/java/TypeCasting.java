package core.java;

/**
 *
 * @author MISS KARINA
 */
public class TypeCasting {
    public static void main(String[] args) {
        // Widening Type Casting (smaller to larger) - automatic
        int intVal = 100;
        double doubleVal = intVal;  // int to double
        System.out.println("Widening Casting:");
        System.out.println("Integer value: " + intVal);
        System.out.println("Converted to double: " + doubleVal);

        // Narrowing Type Casting (larger to smaller) - manual
        double originalDouble = 99.99;
        int convertedInt = (int) originalDouble;  // double to int
        System.out.println("\nNarrowing Casting:");
        System.out.println("Original double: " + originalDouble);
        System.out.println("Converted to int: " + convertedInt);

        // Another example: char to int
        char ch = 'A';
        int charToInt = ch;
        System.out.println("\nChar to Int:");
        System.out.println("Character: " + ch);
    }
}