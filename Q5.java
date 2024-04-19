package Nullpoint;
public class Q5 {

    public static void main(String[] args) {
        try {
            double result = performComplexComputation(10.0, 2.0);
            System.out.println("Result of the complex computation: " + result);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double performComplexComputation(double x, double y) {
        try {
      
            double result = Math.log(x) + Math.sin(y) + Math.sqrt(x * y) + Math.pow(x, y);
            return result;
        } catch (NullPointerException e) {
            throw new NullPointerException("Null pointer exception occurred during computation");
        }
    }
}
