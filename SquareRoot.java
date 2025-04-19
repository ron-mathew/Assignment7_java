// SquareRoot.java
public class SquareRoot implements Calculator {
    public double calculate(double a, double b) throws ArithmeticException {
        if (a < 0) {
            throw new ArithmeticException("Cannot take square root of negative number.");
        }
        return Math.sqrt(a);  // b is ignored
    }
}
