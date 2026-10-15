package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number : ");
        double num2 = scanner.nextDouble();

        System.out.printf("\nYou entered %.2f and %.2f\n",num1 ,num2);


    }
}
