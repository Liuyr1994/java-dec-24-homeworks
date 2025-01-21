package ru.otus.java.basic.homeworks.homework4.user;

public class User {
    private String surName;
    private String name;
    private String patronymic;
    private int yearOfBirth;
    private String email;

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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
