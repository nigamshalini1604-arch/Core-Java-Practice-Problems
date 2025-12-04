package org.example.oopsPractice;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("Enter your choice (1-4):");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Addition");
                    System.out.println("Enter first number:");
                    int num1 = scan.nextInt();
                    System.out.println("Enter second number:");
                    int num2 = scan.nextInt();
                    System.out.println("Addition: " + calculator.add(num1, num2));
                    break;

                case 2:
                    System.out.println("You selected Subtraction");
                    System.out.println("Enter first number:");
                    num1 = scan.nextInt();
                    System.out.println("Enter second number:");
                    num2 = scan.nextInt();
                    System.out.println("Subtraction: " + calculator.sub(num1, num2));
                    break;
                case 3:
                    System.out.println("You selected Multiplication");
                    System.out.println("Enter first number:");
                    num1 = scan.nextInt();
                    System.out.println("Enter second number:");
                    num2 = scan.nextInt();
                    System.out.println("Multiplication: " + calculator.multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("You selected Division");
                    System.out.println("Enter first number:");
                    num1 = scan.nextInt();
                    System.out.println("Enter second number:");
                    num2 = scan.nextInt();
                    System.out.println("Division: " + calculator.devide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
        scan.close();
    }

}
