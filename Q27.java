package Nullpoint;
public class Q27 {
    public static void main(String[] args) {
        try {
            Object obj = "Hello"; // Assigning a String object to an Object reference
            Integer num = (Integer) obj; // Trying to cast String to Integer, which leads to ClassCastException
            System.out.println("Integer value: " + num);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }
}
