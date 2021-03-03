package com.rcs.classwork.Day8;

import java.util.Scanner;

public class WhileLoopThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi skaitli: ");
        int n = scanner.nextInt();
        scanner.close();

        int i = 1;
        while(i <= n) {
            System.out.printf("%d * %d = %d\n", n, i, n*i);
            i++;
        }
    }
}
