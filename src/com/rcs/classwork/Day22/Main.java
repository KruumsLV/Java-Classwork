package com.rcs.classwork.Day22;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
/*        String[] array = new String[1];
        array[0] = "Kristaps";*/

/*        int[] array = new int[2];
        array[0] = 1;
        array[0] = 2;*/

/*        Author[] autori = {
                new Author("Kristaps", "Krumins"),
                new Author("Kristine", "Krastina")
        };*/

/*        Scanner scanner = new Scanner(System.in);
        String gramatasNosaukums = scanner.nextLine();
        Author[] authors = new Author[3];
        for(int i = 0; i < 3; i++) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Surname: ");
            String surname = scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            Gender genderValue = Gender.valueOf(gender.toUpperCase());
            authors[i] = new Author(name, surname, genderValue, "");
        }
        scanner.close();*/

        //Book gramata1 = new Book(gramatasNosaukums, authors);

        Book gramata1 = new Book("Mana gramata", new Author[] {
                new Author("Kristaps", "Krumins"),
                new Author("Kristine", "Krastina", Gender.FEMALE, "Latvija", LocalDate.of(1990, 4, 5)),
                new Author("Janis", "Berzins", Gender.MALE, "Latvija")
        });
        System.out.println(gramata1);
    }
}
