package core.java;

/**
 *
 * @author MISS KARINA
 */
public class StringExample {
    public static void main(String[] args) {
        // String declaration
        String name = "Karina";
        String greeting = "Hello";

        // Concatenation
        String message = greeting + " " + name;
        System.out.println("Message: " + message);

        // Length of string
        System.out.println("Length of name: " + name.length());

        // Convert to uppercase
        System.out.println("Name in uppercase: " + name.toUpperCase());

        // Convert to lowercase
        System.out.println("Name in lowercase: " + name.toLowerCase());

        // Compare two strings
        String anotherName = "karina";
        boolean isEqual = name.equals(anotherName); // case-sensitive
        System.out.println("Is name equal to 'karina'? " + isEqual);

        // Ignore case comparison
        boolean isEqualIgnoreCase = name.equalsIgnoreCase(anotherName);
        System.out.println("Is name equal to 'karina' (ignore case)? " + isEqualIgnoreCase);
    }
}
