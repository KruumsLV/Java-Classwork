package com.rcs.classwork.Day22;

import java.time.LocalDate;

public class Author {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String country;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Author(String name, String surname, Gender gender, String country) {
        this(name, surname);
        this.gender = gender;
        this.country = country;
    }

    public Author(String name, String surname, Gender gender, String country, LocalDate dateOfBirth) {
        this(name, surname, gender, country);
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s)", this.name, this.surname,
                dateOfBirth != null ? this.dateOfBirth.toString() : "Nezināms");
    }
}
