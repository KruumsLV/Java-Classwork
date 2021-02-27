package com.rcs.classwork.Day5;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi skaitli: ");
        int num = scanner.nextInt();
        scanner.close();
        if (num % 2 == 0) {
            System.out.printf("%d ir pāra skaitlis", num);
        } else {
            System.out.printf("%d ir nepāra skaitlis", num);
        }
    }
}
