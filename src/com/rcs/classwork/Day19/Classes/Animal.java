package com.rcs.classwork.Day19.Classes;

public class Animal {
    public String color;

    public Animal() {
        this.color = "Unknown";
    }

    public Animal(String color) {
        this.color = color;
    }

    public void saySomething() {
        System.out.println("Animal said something...");
    }
}
