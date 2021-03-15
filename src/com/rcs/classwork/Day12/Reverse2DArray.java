package com.rcs.classwork.Day12;

import java.util.Random;

public class Reverse2DArray {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(8) + 2;
        int m = random.nextInt(8) + 2;
        int[][] array2D = new int[n][m];

        //1.) Aizpildīt 2D masīvu ar random vērtībām 0 - 100
        for(int i = 0; i < array2D.length; i++) {
            for(int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = random.nextInt(101);
            }
        }
        //2.) Izvadīt 2D masīvu tabulas formātā
        for(int[] row : array2D) {
            for(int column : row) {
                System.out.printf("%4d ", column);
            }
            System.out.println();
        }

        //3.) Apgriežam rindas pretējā virzienā
        //int[] temp;
        for(int i = 0; i < array2D.length / 2; i++) {
            // Reverse logic
            int oppositeIndex = array2D.length - 1 - i;
            // array2D[i] <=> array2D[oppositeIndex]
            int[] temp = array2D[i];
            array2D[i] = array2D[oppositeIndex];
            array2D[oppositeIndex] = temp; //temp;
        }
        // Orginal:
        // 1, 2, 3, 4
        // 41, 23, 42, 13
        // 124, 14, 32, 13
        // 1, 5, 6, 1

        // 6, 5, 1, 1
        // 42, 41, 23, 13
        // 124, 32, 14, 13
        // 4, 3, 2, 1

        // Reversed:
        // 1, 5, 6, 1
        // 124, 14, 32, 13
        // 41, 23, 42, 13
        // 1, 2, 3, 4

        //4.) Izvadām apstrādāto masīvu
        System.out.println();
        for(int[] row : array2D) {
            for(int column : row) {
                System.out.printf("%4d ", column);
            }
            System.out.println();
        }

    }
}
