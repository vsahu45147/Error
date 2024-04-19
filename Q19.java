package Nullpoint;
import java.util.Arrays;

public class Q19 {

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 3, 1, 7, 4};

        // Sort the array
        sortArray(array);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Search for an element in the array
        int elementToSearch = 7;
        int index = searchElement(array, elementToSearch);
        if (index != -1) {
            System.out.println("Element " + elementToSearch + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the array.");
        }

        // Access elements at various indices
        accessElements(array);
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    public static int searchElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }

    public static void accessElements(int[] array) {
        // Introduce scenarios where accessing elements beyond the bounds of the array leads to ArrayIndexOutOfBoundsException
        try {
            int element1 = array[7]; // Accessing element beyond array bounds
            System.out.println("Element at index 7: " + element1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index 7 is out of bounds for array length " + array.length);
        }

        try {
            int element2 = array[-1]; // Accessing element with negative index
            System.out.println("Element at index -1: " + element2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Negative index is not valid.");
        }
    }
}
