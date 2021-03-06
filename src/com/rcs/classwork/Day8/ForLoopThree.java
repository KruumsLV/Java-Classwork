package com.rcs.classwork.Day8;

import java.util.Scanner;

public class ForLoopThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi skaitli: ");
        int n = scanner.nextInt();
        scanner.close();

        for(int m = 1; m <= n; m++) {
            System.out.printf("%d * %d = %d\n", n, m, n*m);
        }
    }
}
