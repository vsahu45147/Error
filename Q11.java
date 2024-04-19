package Nullpoint;
import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();

        try {
            double result = calculateFunctionValue(x);
            System.out.println("Result of the function: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred or invalid mathematical operation.");
        }

        scanner.close();
    }

    public static double calculateFunctionValue(double x) throws ArithmeticException {
        double sinValue = Math.sin(x);
        double cosValue = Math.cos(x);
        double tanValue = Math.tan(x);
        double cotValue = 1.0 / tanValue; // cot(x) = 1 / tan(x)
        
        // Check if the denominator (tan(x) - cot(x)) is approximately zero to avoid division by zero
        if (Math.abs(tanValue - cotValue) < 1e-10) {
            throw new ArithmeticException("Division by zero occurred or invalid mathematical operation.");
        }
        
        // Compute the numerator and denominator
        double numerator = Math.log(sinValue + cosValue);
        double denominator = tanValue - cotValue;
        
        // Check if the denominator is approximately zero to avoid division by zero
        if (Math.abs(denominator) < 1e-10) {
            throw new ArithmeticException("Division by zero occurred or invalid mathematical operation.");
        }
        
        return numerator / denominator;
    }
}
