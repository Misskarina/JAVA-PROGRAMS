package core.java;

public class NonPrimitive_String {
    public static void main(String[] args) {
        // Creating a String
        String message = "Hello, Java!";
        
        // Displaying the String
        System.out.println("Original String: " + message);

        // String Length
        System.out.println("Length of String: " + message.length());

        // Convert to Uppercase
        System.out.println("Uppercase: " + message.toUpperCase());

        // Convert to Lowercase
        System.out.println("Lowercase: " + message.toLowerCase());

        // Substring
        System.out.println("Substring (0-5): " + message.substring(0, 5));

        // Concatenation
        String newMessage = message.concat(" Welcome!");
        System.out.println("Concatenated String: " + newMessage);

        // String Comparison
        String anotherMessage = "hello, java!";
        System.out.println("Strings are equal (case-sensitive): " + message.equals(anotherMessage));
        System.out.println("Strings are equal (ignore case): " + message.equalsIgnoreCase(anotherMessage));

        // Finding Character at Specific Index
        System.out.println("Character at index 7: " + message.charAt(7));

        // Replacing Characters
        System.out.println("Replacing 'Java' with 'World': " + message.replace("Java", "World"));
    }
}
