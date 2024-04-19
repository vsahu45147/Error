package Nullpoint;
//CustomCheckedException.java
 class CustomCheckedException extends Exception {
 public CustomCheckedException(String message) {
     super(message);
 }
}
//Main.java
public class Q22 {
 public static void main(String[] args) {
     try {
         // Simulating a situation where a specific error condition occurs
         throwCustomCheckedException();
     } catch (CustomCheckedException e) {
         System.out.println("Caught CustomCheckedException: " + e.getMessage());
     }
 }

 public static void throwCustomCheckedException() throws CustomCheckedException {
     // In a real scenario, you might have some condition that leads to this exception
     // For demonstration, we'll just throw it directly
     throw new CustomCheckedException("This is a custom checked exception");
 }
}
