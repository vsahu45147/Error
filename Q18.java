package Nullpoint;
public class Q18 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = calculateArraySum(array);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int calculateArraySum(int[] array) {
        return calculateArraySumHelper(array, 0); // Start recursion from index 0
    }

    private static int calculateArraySumHelper(int[] array, int index) {
        // Base case: if index is equal to array length, return 0
        if (index == array.length) {
            return 0;
        }
        
        // Recursive case: calculate sum of current element and sum of remaining elements
        try {
            int currentElement = array[index];
            int remainingSum = calculateArraySumHelper(array, index + 1);
            return currentElement + remainingSum;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle case where index goes beyond the bounds of the array
            System.out.println("Encountered ArrayIndexOutOfBoundsException at index " + index);
            return 0; // Return 0 to terminate recursion
        }
    }
}
