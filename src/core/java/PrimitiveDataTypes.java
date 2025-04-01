package core.java;
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Integer Type
        int age = 25;
        byte smallNumber = 127;
        short shortNumber = 32000;
        long bigNumber = 9876543210L; // 'L' is required for long literals

        // Floating-point Type
        float height = 5.9f;  // 'f' is required for float
        double weight = 72.5; // More precise than float

        // Character Type
        char grade = 'A';
        char numberChar = '5';

        // Boolean Type
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // Displaying all values
        System.out.println("Integer Data Types:");
        System.out.println("Age: " + age);
        System.out.println("Byte Value: " + smallNumber);
        System.out.println("Short Number: " + shortNumber);
        System.out.println("Long Number: " + bigNumber);
        
        System.out.println("\nFloating-point Data Types:");
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        
        System.out.println("\nCharacter Data Type:");
        System.out.println("Grade: " + grade);
        System.out.println("Character as a number (ASCII): " + (int)numberChar);
        
        System.out.println("\nBoolean Data Type:");
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);
    }
}
