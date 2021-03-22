package com.rcs.classwork.Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> toDoItems = new ArrayList<>();
        System.out.println("Ievadiet darāmo lietu sarakstu: ");
        while(true) {
            String userInput = scanner.nextLine();
            if(userInput.equalsIgnoreCase("exit")) {
                break;
            }
            toDoItems.add(userInput);
        }

/*        String userInput;
        do {
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("exit")) {
                toDoItems.add(userInput);
            }
        } while(!userInput.equalsIgnoreCase("exit"));*/

/*      String userInput = "";
        while (!userInput.equalsIgnoreCase("exit")) {
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("exit")) {
                toDoItems.add(userInput);
            }
        }*/

        scanner.close();

        System.out.printf("Jūsu sarakstā ir %d lietas:\n", toDoItems.size());
        for (int i = 0; i < toDoItems.size(); i++) {
            System.out.printf("To-Do Item %d: %s\n", i + 1, toDoItems.get(i));
        }
    }
}
