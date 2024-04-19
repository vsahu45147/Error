package Nullpoint;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = readInteger(scanner);
        System.out.println("You entered: " + number);
        scanner.close();
    }

    public static int readInteger(Scanner scanner) {
        int number = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();
                isValidInput = true; // Input is valid if no exception is thrown
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        return number;
    }
}
