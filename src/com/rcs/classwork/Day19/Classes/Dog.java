package com.rcs.classwork.Day19.Classes;

public class Dog extends Animal {
    public String breed;
    public String name;

    public Dog(String breed) {
        super();
        this.breed = breed;
        this.name = "Unknown";
    }

    public Dog(String breed, String color, String name) {
        super(color);
        this.breed = breed;
        this.name = name;
    }

    @Override
    public void saySomething() {
        System.out.println("Woof woof");
    }
}
