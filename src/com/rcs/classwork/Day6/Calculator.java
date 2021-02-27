package com.rcs.classwork.Day6;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadiet a: ");
        float a = scanner.nextFloat();
        System.out.print("Ievadiet b: ");
        float b = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Ievadiet darbību (+,-,*,/): ");
        String action = scanner.nextLine();
        scanner.close();
        char actionChar = action.charAt(0);
        switch (actionChar) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", a, b, a + b);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", a, b, a - b);
                break;
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", a, b, a / b);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", a, b, a * b);
                break;
            default:
                System.out.println("Kļūda!");
        }
    }
}
