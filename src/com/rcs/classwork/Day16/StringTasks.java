package com.rcs.classwork.Day16;

import com.rcs.classwork.Day16Classes.StringUtils;

import java.util.Scanner;

public class StringTasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String someText = scanner.nextLine();
        scanner.close();

        System.out.printf("Text middle: %s\n", StringUtils.getMiddle(someText));
        System.out.printf("Reversed text: %s\n", StringUtils.getReverse(someText));
        System.out.printf("Is Palindrome: %s\n", StringUtils.isPalindrome(someText));
    }
}
