package com.rcs.classwork.Day21.customerAccounts;

import java.io.Serializable;
import java.time.LocalDate;

public class Customer implements Serializable {
    private int id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public Customer(int id, String name, String surname, LocalDate date) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = date;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("%d: %s %s %s", this.id, this.name,
                this.surname, this.dateOfBirth.toString());
    }
}
