package ru.otus.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean isSatiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return isSatiety;
    }

    public void setSatiety(boolean satiety) {
        isSatiety = satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "имя='" + name + '\'' +
                ", аппетит=" + appetite +
                ", Сытость=" + isSatiety +
                '}';
    }
}
