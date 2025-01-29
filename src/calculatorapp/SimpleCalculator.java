package calculatorapp;

import java.util.Scanner;

/**
 * @author Carl Palad
 * @version 29/01/2025
 * Making a simple calculator that can do addition, subtraction, multiplication, and division.
 */

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Choose an operation
        System.out.print("Choose an operation, '+', '-', 'x', or '/': ");
        char operator = input.next().charAt(0);

        while (operator != '+' && operator != '-' && operator != 'x' && operator != '/') {
            System.out.println("Invalid operation.");
            System.out.print("Choose an operation, '+', '-', 'x', or '/': ");
            operator = input.next().charAt(0);
        }

        // Get number one for the operation
        System.out.print("Choose a number from -1000 to 1000: ");
        double num1 = input.nextDouble();

        // Check if the number one is within the range
        while (num1 > 1000 || num1 < -1000) {
            System.out.println("Invalid integer chosen.");
            System.out.print("Choose a number from -1000 to 1000: ");
            num1 = input.nextDouble();
        }

        // Get number two for the operation
        System.out.print("Choose a second number from -1000 to 1000: ");
        double num2 = input.nextDouble();

        // Check if the number two is within the range
        while (num2 > 1000 || num2 < -1000) {
            System.out.println("Invalid integer chosen.");
            System.out.print("Choose a number from -1000 to 1000: ");
            num2 = input.nextDouble();
        }

        // Close the scanner
        input.close();

        // Find the answer
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == 'x') {
            System.out.println(num1 * num2);
        } else {
            if (num2 == 0) {
                System.out.println("Division by zero is undefined.");
            } else {
                System.out.println(num1 / num2);
            }
            
        }
    }
    
}
