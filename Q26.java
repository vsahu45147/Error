package Nullpoint;
public class Q26 {
    public static void main(String[] args) {
        try {
            // Simulate ClassNotFoundException by attempting to load a non-existing class
            Class<?> clazz = Class.forName("NonExistingClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block for ClassNotFoundException.");
        }

        try {
            // Simulate MethodNotFoundException by calling a non-existing method
            invokeNonExistingMethod();
        } catch (MethodNotFoundException e) {
            System.out.println("Method not found: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block for MethodNotFoundException.");
        }
    }

    public static void invokeNonExistingMethod() throws MethodNotFoundException {
        // Simulate a hypothetical situation where a method is not found
        throw new MethodNotFoundException("The method does not exist.");
    }
}

class MethodNotFoundException extends Exception {
    public MethodNotFoundException(String message) {
        super(message);
    }
}
