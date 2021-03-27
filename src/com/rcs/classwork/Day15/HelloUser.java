package com.rcs.classwork.Day15;

public class HelloUser {

    public static void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void sayHello(String user) {
        System.out.printf("Hello, %s !\n", user);
    }

    public static void main(String[] args) {
        sayHelloWorld();

        sayHello("Kristaps");
        // Hello, Kristaps!

        sayHello("Jānis");
        // Hello, Jānis!
    }
}
