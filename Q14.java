package Nullpoint;
import java.util.Scanner;

public class Q14 {

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
        double cotValue = 1 / tanValue; // cot(x) = 1 / tan(x)

        // Calculate the numerator (log(|sin(x) + cos(x)|))
        double numerator = Math.log(Math.abs(sinValue + cosValue));

        // Check if the numerator is negative to avoid taking logarithm of negative values
        if (numerator < 0) {
            throw new ArithmeticException("Logarithm of negative value is undefined.");
        }

        // Check if the denominator (tan(x) - cot(x)) is approximately zero to avoid division by zero
        if (Math.abs(tanValue - cotValue) < 1e-10) {
            throw new ArithmeticException("Division by zero occurred or invalid mathematical operation.");
        }

        return numerator / (tanValue - cotValue);
    }
}
