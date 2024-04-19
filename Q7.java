package Nullpoint;
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number as string: ");
        String input = scanner.nextLine();

        int result = convertStringToInt(input);
        System.out.println("Integer value: " + result);
        scanner.close();
    }

    public static int convertStringToInt(String input) {
        int number = 0;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid number.");
            System.out.print("Please enter a valid number: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            number = convertStringToInt(input); // Recursive call to attempt conversion again
            scanner.close();
        }
        return number;
    }
}
