package Nullpoint;
public class Q1 {

    public static void main(String[] args) {
        try {
            // Simulating a NullPointerException
            String str = null;
            int length = str.length(); // This line will throw NullPointerException
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            e.printStackTrace();
        }
    }
}
