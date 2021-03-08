package com.rcs.classwork.Day10;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numberArray = new int[5];
        for(int i = 0; i < numberArray.length; i++) {
            // TODO: Nomainīt uz Random (robežās no 20 līdz 50)
            numberArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(numberArray));
        for(int i = 0; i < numberArray.length / 2; i++) {
            // numberArray[i] <=> numberArray[numberArray.lenght - i - 1]

        }
    }
}
