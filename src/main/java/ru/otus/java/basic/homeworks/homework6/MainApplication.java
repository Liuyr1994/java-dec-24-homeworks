package ru.otus.java.basic.homeworks.homework6;

public class MainApplication {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Gena", 12),
                new Cat("Rodya", 12),
                new Cat("Alesya", 12),
                new Cat("Vasya", 12),
        };
        Plate plate = new Plate(100);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < cats.length; j++) {
                cats[j].setSatiety(plate.removeFood(cats[j].getAppetite()));
                System.out.println(cats[j]);
            }
        }
    }
}
