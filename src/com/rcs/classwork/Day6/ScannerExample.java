package com.rcs.classwork.Day6;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        System.out.print("Ievadi skaitli: ");
        if (scanner.hasNextDouble()) {
            System.out.println(scanner.nextDouble());
            points++; // points = points + 1;
        }
        scanner.nextLine();
        System.out.print("Ievadi boolean tipa vērtību: ");
        if (scanner.hasNextBoolean()) {
            System.out.println(scanner.nextBoolean());
            points++;
        }
        scanner.nextLine();
        System.out.print("Ievadi teskstu: ");
        if (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            points++;
        }
        scanner.close();
        System.out.println("Punktu skaits: " + points);
    }
}
