package ru.otus.java.basic.homeworks.homework5.animal;

public class MainApplication {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat("Alesya", 0),
                new Dog("Rodya", 2),
                new Horse("Vasilisa", 4)
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(5);
            animals[i].swim(10);
        }
    }
}
