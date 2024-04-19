package Nullpoint;
import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();

        try {
            double result = evaluateFunction(x);
            System.out.println("Result of the function: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred or invalid mathematical operation.");
        }

        scanner.close();
    }

    public static double evaluateFunction(double x) throws ArithmeticException {
        double sinValue = Math.sin(x);
        double cosValue = Math.cos(x);

        // Check if the denominator (sin(x) + cos(x)) is approximately zero to avoid division by zero
        if (Math.abs(sinValue + cosValue) < 1e-10) {
            throw new ArithmeticException("Division by zero occurred or invalid mathematical operation.");
        }

        return (sinValue * cosValue) / (sinValue + cosValue);
    }
}
