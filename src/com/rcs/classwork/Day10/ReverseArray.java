package com.rcs.classwork.Day10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadiet masīva izmēru: ");
        int arraySize = scanner.nextInt();

        int[] numberArray = new int[arraySize];
        Random rnd = new Random();
        for(int i = 0; i < numberArray.length; i++) {
            numberArray[i] = rnd.nextInt(31) + 20; // Vajag vērtibu robežās [20; 50]
        }
        System.out.println(Arrays.toString(numberArray));

        // Input:
        // 1 2 3 4 5
        // Output:
        // 5 4 3 2 1

        for(int i = 0; i < numberArray.length / 2; i++) {
            // numberArray[i] <=> numberArray[numberArray.length - i - 1]
            int temp = numberArray[i];
            numberArray[i] = numberArray[numberArray.length - i - 1];
            numberArray[numberArray.length - i - 1] = temp;
        }

        for(int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + (i < numberArray.length - 1 ? ", " : ""));
/*            if (i < numberArray.length - 1) {
                System.out.print(",");
            }*/
        }

/*        int i = 0;
        for(int num : numberArray) {
            System.out.print(num);
            if (i < numberArray.length - 1) {
                System.out.print(",");
            }
            i++;
        }*/
    }
}
