package com.rcs.classwork.Day8;

public class WhileLoopOne {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 10) {
            sum += i; //sum = sum + i;
            System.out.println(i++);
        }
        System.out.println("Summa: " + sum);
    }
}
