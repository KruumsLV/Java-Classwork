package com.rcs.classwork.Day10;

import java.util.Locale;
import java.util.Scanner;

public class FindName
{
    public static void main(String[] args) {
        String[] names = { "Kristaps", "Kristīne", "Līga",
                            "Matīss", "Martiņš", "Jānis",
                            "Ilze", "Sanita", "Sandijs" };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Meklēt: ");
        String searchBy = scanner.next();
        scanner.close();

        for(String name : names) {
            if (name.toLowerCase().startsWith(searchBy.toLowerCase())) {
                System.out.println(name);
            }
        }

/*      for(int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().startsWith(searchBy.toLowerCase())) {
                System.out.println(names[i]);
            }
        }*/

        // Atrodam visus vārdus, kuri sākās ar searchBy
        // * Cikliski ejam cauri masīva "names" elementiem
        // * Izvadām uz ekrāna tos elementus, kuri sākās ar searchBy
        // Cikls 1. => for(int i = 0; i < array.length; i+)
        // array[i]
        // Cikls 2. (Enhanced For loop)
        // for(dataytype varName : array)
        // kur datatype -> datu tips, kādus elementus satur
        // array

    }
}
