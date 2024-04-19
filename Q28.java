package Nullpoint;
public class Q28 {
    public static void main(String[] args) {
        try {
            recursiveMethod(1);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught: " + e.getMessage());
        }
    }

    public static void recursiveMethod(int n) {
        System.out.println("Recursive call: " + n);
        recursiveMethod(n + 1); // Recursive call that eventually leads to StackOverflowError
    }
}
