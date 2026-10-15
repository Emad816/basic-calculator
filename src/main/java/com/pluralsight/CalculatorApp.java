package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number : ");
        double num2 = scanner.nextDouble();

        System.out.printf("\nYou entered %.2f and %.2f what would you like to do?\n",num1 ,num2);
        System.out.println("Possible calculations: Enter the character that represent your function\n" +
                "(A)dd \n" +
                "(S)ubtract \n" +
                "(M)ultiply \n" +
                "(D)ivide ");
        char task = scanner.next().charAt(0);
        double answer;
        if (task == 'A'){
            answer = num1 + num2;
            System.out.printf("%.2f + %.2f = %.2f",num1 ,num2 ,answer);
        } else if (task == 'S') {
            answer = num1 - num2;
            System.out.printf("%.2f - %.2f = %.2f",num1 ,num2 ,answer);
        } else if (task == 'M') {
            answer = num1 * num2;
            System.out.printf("%.2f * %.2f = %.2f",num1 ,num2 ,answer);
        } else if (task == 'D') {
            answer = num1 / num2;
            System.out.printf("%.2f / %.2f = %.2f",num1 ,num2 ,answer);
        }else {
            System.out.println("Invalid Choice.");
        }

    }
}
