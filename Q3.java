package Nullpoint;
class CustomNullPointerException extends RuntimeException {

    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class Q3 {

    public static void main(String[] args) {
        try {
            String str = null;
            if (str == null) {
                throw new CustomNullPointerException("Custom Error: String is null.");
            }
        } catch (CustomNullPointerException e) {
            System.out.println("Caught CustomNullPointerException: " + e.getMessage());
        }
    }
}
