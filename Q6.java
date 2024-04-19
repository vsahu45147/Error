package Nullpoint;

public class Q6 {

    public static void main(String[] args) {
        try {
            String numberStr = "abc"; 
            int number = Integer.parseInt(numberStr); 
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input string is not a valid number.");
            e.printStackTrace();
        }
    }
}
