package core.java;
/**
 *
 * @author MISS KARINA
 */
public class Expressions {
    public static void main(String[] args) {
        // 1. Arithmetic Expression
        int a = 10, b = 5, c = 2;
        int result = (a + b) * c;  // (10 + 5) * 2 = 30
        System.out.println("Arithmetic Expression Result: " + result);

        // 2. Relational Expression
        boolean isGreater = a > b;  // 10 > 5 → true
        System.out.println("Relational Expression (a > b): " + isGreater);

        // 3. Logical Expression
        boolean condition = (a > b) && (b > c);  // true && true → true
        System.out.println("Logical Expression ((a > b) && (b > c)): " + condition);

        // 4. Assignment Expression
        int x;
        x = a + b;  // x = 10 + 5 = 15
        System.out.println("Assignment Expression (x = a + b): " + x);

        // 5. Unary Expression
        int y = 5;
        int unaryResult = -y;  // -5
        System.out.println("Unary Expression (-y): " + unaryResult);

        // 6. Ternary Expression
        int min = (a < b) ? a : b;
        System.out.println("Ternary Expression Result (Smaller number): " + min);
    }
}