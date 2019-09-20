package com.example.homework37;

import java.io.Serializable;

public class Task implements Serializable {
    public int id;
    String name;
    String surname;
    String year;

    public Task(int id, String name, String surname, String year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.id = id;
    }
}
