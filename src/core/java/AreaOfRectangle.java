package core.java;
import java.util.Scanner;
/**
 *
 * @author MISS KARINA
 */
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input length and width
        System.out.print("Enter length of the rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter width of the rectangle: ");
        int width = sc.nextInt();

        int area = length * width;

        System.out.println("Area of Rectangle: " + area);
    }
}
