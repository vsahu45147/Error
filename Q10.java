package Nullpoint;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();

        try {
            double result = calculateExpression(x);
            System.out.println("Result of the expression: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred. x is close to multiples of π/2.");
        }

        scanner.close();
    }

    public static double calculateExpression(double x) throws ArithmeticException {
        double sinValue = Math.sin(x);
        double cosValue = Math.cos(x);
        double tanValue = Math.tan(x);
        
        // Check if tan(x) is approximately zero to avoid division by zero
        if (Math.abs(tanValue) < 1e-10) {
            throw new ArithmeticException("Division by zero occurred. x is close to multiples of π/2.");
        }
        
        return (sinValue + cosValue) / tanValue;
    }
}
