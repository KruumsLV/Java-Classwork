package com.rcs.classwork.Day9;

public class AverageGrades {
    public static void main(String[] args) {
/*        int[] grades = new int[8];
        grades[0] = 1;
        //...*/
        int[] grades = { 5, 6, 8, 3, 10, 3, 7, 8 };
        int sum = 0;
        for(int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
            sum += grades[i];
        }
        // int x = 5.0f
        // int y = 2
        // x / y = 2
        // float fy = x / y;

        float average = (float)sum / grades.length;
        System.out.printf("Average: %.2f", average);
    }
}
