package com.rcs.classwork.Day8;

import java.util.Scanner;

public class DoWhileLoopTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        int i = 0;
        do {
            System.out.println(Character.toUpperCase(text.charAt(i++)));
        } while (i < text.length());
    }
}
