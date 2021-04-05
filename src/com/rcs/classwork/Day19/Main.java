package com.rcs.classwork.Day19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*        for(Day diena : Day.values()) {
            System.out.println(diena);
        }*/

        Scanner scanner =  new Scanner(System.in);
/*        System.out.print("Ievadi dienas kārtas nr. (1-7): ");
        int dayNr = scanner.nextInt();*/
        System.out.print("Ievadi dienu (MONDAY-SUNDAY): ");
        String dayValue = scanner.nextLine();
        scanner.close();

        //Day[] dayArray = Day.values();
        // [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]
        //Day diena = Day.values()[dayNr - 1];

        Day diena = Day.getDayLV(dayValue);

        switch(diena) {
            case MONDAY:
                System.out.println("Pirmdiena");
                break;
            case FRIDAY:
                System.out.println("Piektdiena");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Nedēļas nogale");
                break;
            default:
                System.out.println("Nedēļas vidus");
        }
    }
}
