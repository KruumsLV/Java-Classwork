package com.rcs.classwork.Day6;

import java.util.Scanner;

public class WeirdOrNot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadiet skaitli: ");
        int x = scanner.nextInt();
        scanner.close();
        if (x % 2 != 0 || (x >= 6 && x <= 20)) {
            System.out.println("Dīvaini...");
        } else {
            System.out.println("Nav dīvaini");
        }
    }
}
