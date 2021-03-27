package com.rcs.classwork.Day15;

import java.util.Arrays;

public class ArrayAverage {

    public static float getAverage(int[] array) {
        // aprēķināt array elementu vidējo vērtību un atgriezt to
        int sum = 0;
        for(int num : array) {
            sum += num;
        }

        return (float)sum / array.length;
    }

    public static void main(String[] args) {
        int[] array = { 3, 1213, 51, 13, 6, 8 };
        System.out.println(Arrays.toString(array));
        System.out.println(getAverage(array));
    }
}
