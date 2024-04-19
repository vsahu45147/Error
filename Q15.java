package Nullpoint;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number as string: ");
            String numberStr = scanner.nextLine();

            // Outer try-catch block to handle NumberFormatException
            try {
                int number = Integer.parseInt(numberStr);
                
                // Inner try-catch block to handle ArithmeticException
                try {
                    int result = divideByZero(number);
                    System.out.println("Result of division: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero occurred.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Input string is not a valid number.");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        scanner.close();
    }

    public static int divideByZero(int number) {
        return number / 0; 
    }
}


