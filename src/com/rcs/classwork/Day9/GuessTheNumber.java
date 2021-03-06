package com.rcs.classwork.Day9;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzmini ciparu [0..9]: ");
        int number = new Random().nextInt(10);


        while(true) {
            int guess = scanner.nextInt();
            if (guess == number) {
                break;
            } else {
                System.out.print("Nepareizi! Mēģini vēlreiz: ");
            }
        }

/*        do {
            guess = scanner.nextInt();
            if (guess > 9 || guess < 0) {
                System.out.print("Iemācies lasīt..mini no 0 līdz 9: ");
            } else if (guess != number){
                System.out.print("Nepareizi! Mēģini vēlreiz: ");
            }
        } while(guess != number);*/

/*        while(guess != number) {
            if (guess > 9 || guess < 0) {
                System.out.print("Iemācies lasīt..mini no 0 līdz 9");
            } else {
                System.out.print("Nepareizi! Mēģini vēlreiz: ");
            }
            guess = scanner.nextInt();
        }*/

        scanner.close();
        System.out.println("Pareizi! Cipars ir " + number);
    }
}
