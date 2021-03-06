package com.rcs.classwork.Day8;

public class DoWhileLoopOne {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        do {
            sum += i;
            System.out.println(i++);
        } while(i < 10);
        System.out.println("Summa: " + sum);
    }
}
