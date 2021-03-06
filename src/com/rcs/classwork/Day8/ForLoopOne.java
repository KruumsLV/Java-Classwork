package com.rcs.classwork.Day8;

public class ForLoopOne {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Summa: " + sum);
    }
}
