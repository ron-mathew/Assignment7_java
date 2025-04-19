// Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = null;
        int choice;

        System.out.println("Welcome to Java Calculator");

        do {
            // Displaying options
            System.out.println("\nChoose an operation:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Square");
            System.out.println("6: Cube");
            System.out.println("7: Square Root");
            System.out.println("0: Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            double a = 0, b = 0;

            try {
                if (choice >= 1 && choice <= 4) {
                    // Input for binary operations
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                } else if (choice >= 5 && choice <= 7) {
                    // Input for unary operations
                    System.out.print("Enter number: ");
                    a = scanner.nextDouble();
                }

                // Assign the correct calculator implementation
                switch (choice) {
                    case 1: calc = new Addition(); break;
                    case 2: calc = new Subtraction(); break;
                    case 3: calc = new Multiplication(); break;
                    case 4: calc = new Division(); break;
                    case 5: calc = new Square(); break;
                    case 6: calc = new Cube(); break;
                    case 7: calc = new SquareRoot(); break;
                    case 0:
                        System.out.println("Exiting calculator. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                }

                if (choice != 0) {
                    // Perform and display calculation
                    double result = calc.calculate(a, b);
                    System.out.println("Result: " + result);
                }

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }

        } while (choice != 0);

        scanner.close();
    }
}
