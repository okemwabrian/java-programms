import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the first number input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Taking the second number input
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Taking the operation input
        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Switch statement to perform the chosen operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                // Check if the divisor is not zero to avoid division by zero error
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;
            default:
                // If the user enters an invalid operator
                System.out.println("Error: Invalid operator! Please choose +, -, *, or /.");
                break;
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
