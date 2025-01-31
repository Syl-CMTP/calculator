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

        System.out.print("How many numbers do you want to calculate with?: ");
        int numAmount = input.nextInt();
        // Flush the line
        input.nextLine();

        double[] listOfNums = new double[numAmount];

        double num1 = 0.0;

        for (int i = 0; i < listOfNums.length; i++) {
            do {
                System.out.print("Choose a number from -1000 to 1000: ");
                num1 = input.nextDouble();

                if (num1 > 1000 || num1 < -1000) {
                    System.out.println("Invalid integer chosen.");
                }

            } while (num1 > 1000 || num1 < -1000);

            listOfNums[i] = num1; // STore the valid input
        }

        // Close the scanner
        input.close();

        // Find the answer
        double answer = 0.0;
        if (operator == '+') {
            for (int x = 0; x < listOfNums.length; x++) {
                answer += listOfNums[x];
            }
            System.out.println(answer);
        } else if (operator == '-') {
            // Makes 
            for (int x = 1; x < listOfNums.length; x++) {
                answer -= listOfNums[x];
            }
            System.out.println(answer);
        } else if (operator == 'x') {
            for (int x = 0; x < listOfNums.length; x++) {
                answer *= listOfNums[x];
            }
            System.out.println(answer);
        } else {
            for (int x = 0; x < listOfNums.length; x++) {
                if (listOfNums[x] == 0) {
                    System.out.println("Division by zero is undefined.");
                    break;
                } else {
                    answer /= listOfNums[x];
                }
                System.out.println(answer);
            }
        }
    }
    
}
