package com.rcs.classwork.Day19;

import com.rcs.classwork.Day19.Classes.Animal;
import com.rcs.classwork.Day19.Classes.Dog;

public class OOPMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.saySomething();

        Dog rex = new Dog("German Shepard", "Black-brown", "Rex");
        rex.saySomething();
    }
}
