package Nullpoint;
import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            double result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }

    public static double divideNumbers(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) numerator / denominator;
    }
}
