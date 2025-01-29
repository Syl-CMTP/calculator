package calculatorapp;

import java.util.Scanner;

public class CalculatorMain {
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

        // Get Two Numbers for the operation
        System.out.print("Choose a number from -1000 to 1000: ");
        double num1 = input.nextDouble();

        while (num1 > 1000 || num1 < -1000) {
            System.out.println("Invalid integer chosen.");
            System.out.print("Choose a number from -1000 to 1000: ");
            num1 = input.nextDouble();
        }

        System.out.print("Choose a second number from -1000 to 1000: ");
        double num2 = input.nextDouble();

        while (num1 > 1000 || num1 < -1000) {
            System.out.println("Invalid integer chosen.");
            System.out.print("Choose a number from -1000 to 1000: ");
            num1 = input.nextDouble();
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
                System.out.println("Infinity");
            } else {
                System.out.println(num1 / num2);
            }
            
        }
    }
    
}
