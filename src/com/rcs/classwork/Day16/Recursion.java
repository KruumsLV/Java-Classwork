package com.rcs.classwork.Day16;

import java.util.Scanner;

public class Recursion {

    // Piemērs
    // 6! = 6*5*4*3*2*1
    // 6! = 6 * 5!
    // 5! = 5 * 4!
    // 4! = 4 * 3!
    // 3! = 3 * 2!
    // 2! = 2 * 1!
    // 1! = 1
    public static int factorial(int n) {
        return n > 1 ? n * factorial(n - 1) : 1;
        /*int result = 1;
        for(int i = n; i > 0; i--) {
            result *= i;
        }
        return result;*/
    }

    public static int fibonacci(int n) {
        // ja n > 1, tad fibonacci(n - 1) + fibonacci(n - 2), citādāk, n
        return n > 1 ? fibonacci(n - 1) + fibonacci(n - 2) : n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ievadi pozitīvu skaitli: ");
            n = scanner.nextInt();
        } while (n < 0);
        scanner.close();

        System.out.printf("%d! = %d\n", n, factorial(n));
        System.out.printf("Fibonacci of %d = %d", n, fibonacci(n));
    }
}
