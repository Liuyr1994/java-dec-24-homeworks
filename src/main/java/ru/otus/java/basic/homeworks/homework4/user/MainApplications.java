package ru.otus.java.basic.homeworks.homework4.user;

public class MainApplications {
    public static void main(String[] args) {
        User[] users = { new User("A", "A", "A", 1945, "A@mail.ru"), new User("B", "B", "B", 2000, "B@mail.ru"), new User("C", "C", "C", 1994, "C@mail.ru"), new User("D", "D", "D", 1977, "D@mail.ru"), new User("E", "E", "E", 1984, "E@mail.ru"), new User("F", "F", "F", 2004, "F@mail.ru"), new User("H", "H", "H", 1988, "H@mail.ru"), new User("G", "G", "G", 1994, "J@mail.ru"), new User("L", "L", "L", 1987, "L@mail.ru"), new User("R", "R", "R", 2017, "R@mail.ru"), };

        for (int i = 0; i < users.length; i++) {
            if (2025 - users[i].yearOfBirth > 40) {
                System.out.println(users[i].toString());
            }
        }
    }
}
