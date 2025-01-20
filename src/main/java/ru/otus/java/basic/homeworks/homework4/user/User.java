package ru.otus.java.basic.homeworks.homework4.user;

public class User {
    String surName;
    String name;
    String patronymic;
    int yearOfBirth;
    String email;

    public User(String surName, String name, String patronymic, int yearOfBirth, String email) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ФИО: " + surName + ", " + name + ", " + patronymic + "\nГод рождения: " + yearOfBirth + "\nemail: " + email;
    }

    
}
