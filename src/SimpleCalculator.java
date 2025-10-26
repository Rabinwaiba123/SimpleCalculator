import java.util.Scanner;

/**
 * SimpleCalculator
 * A console-based calculator that performs basic arithmetic operations.
 */

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message
        System.out.println("Welcome to the Simple Calculator");


        //Prompt the user to enter two numbers
        System.out.print("Please enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Please enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to choose an operation
        System.out.println("Choose an operation(+,-,*,/): ");
        char operator = scanner.next().charAt(0);
        double result = 0.0;
        boolean validOperation = true;

        // Use switch to perform the selected operation
        switch (operator) {
            case'+':
                result = num1 + num2;
                break;
            case'-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                }else{
                    System.out.println("Error: Cannot divide by zero");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
                break;
        }

        // Display the result if the operation was valid
        if (validOperation) {
            System.out.println("Result is: " + result);
        }

        scanner.close();
    }
}