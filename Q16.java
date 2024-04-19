package Nullpoint;
import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index to access: ");
        int index = scanner.nextInt();

        try {
            int value = getElementAtIndex(array, index);
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds.");
        }

        scanner.close();
    }

    public static int getElementAtIndex(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        return array[index];
    }
}
