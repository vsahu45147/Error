package Nullpoint;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();

        try {
            double result = calculateExpressionValue(x);
            System.out.println("Result of the expression: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred or invalid mathematical operation.");
        }

        scanner.close();
    }

    public static double calculateExpressionValue(double x) throws ArithmeticException {
        double sinValue = Math.sin(x);
        double cosValue = Math.cos(x);
        double tanValue = Math.tan(x);

        // Check if denominator (tan(x) + 1) is approximately zero to avoid division by zero
        if (Math.abs(tanValue + 1) < 1e-10) {
            throw new ArithmeticException("Division by zero occurred or invalid mathematical operation.");
        }

        // Calculate the numerator (sqrt(abs(sin(x) * cos(x))))
        double numerator = Math.sqrt(Math.abs(sinValue * cosValue));

        // Check if the numerator is negative to avoid taking square root of negative values
        if (numerator < 0) {
            throw new ArithmeticException("Square root of negative value is undefined.");
        }

        return numerator / (tanValue + 1);
    }
}
