package core.java;
public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5, x = 8, y = 3;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));  // Equal to
        System.out.println("a != b: " + (a != b));  // Not equal to
        System.out.println("a > b: " + (a > b));    // Greater than
        System.out.println("a < b: " + (a < b));    // Less than
        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b: " + (a <= b));  // Less than or equal to

        // Logical Operators
        boolean bool1 = true, bool2 = false;
        System.out.println("\nLogical Operators:");
        System.out.println("bool1 && bool2: " + (bool1 && bool2));  // AND
        System.out.println("bool1 || bool2: " + (bool1 || bool2));  // OR
        System.out.println("!bool1: " + (!bool1));                  // NOT

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("x & y: " + (x & y));  // AND
        System.out.println("x | y: " + (x | y));  // OR
        System.out.println("x ^ y: " + (x ^ y));  // XOR
        System.out.println("~x: " + (~x));        // Complement
        System.out.println("x << 1: " + (x << 1));// Left shift
        System.out.println("x >> 1: " + (x >> 1));// Right shift

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 20;
        c += 10; // c = c + 10
        System.out.println("c += 10: " + c);
        c -= 5;  // c = c - 5
        System.out.println("c -= 5: " + c);
        c *= 2;  // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4;  // c = c / 4
        System.out.println("c /= 4: " + c);
        c %= 3;  // c = c % 3
        System.out.println("c %= 3: " + c);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 10;
        System.out.println("d: " + d);
        System.out.println("d++: " + (d++));  // Post-increment
        System.out.println("++d: " + (++d));  // Pre-increment
        System.out.println("d--: " + (d--));  // Post-decrement
        System.out.println("--d: " + (--d));  // Pre-decrement

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int min = (a < b) ? a : b;
        System.out.println("Smaller number is: " + min);
    }
}
