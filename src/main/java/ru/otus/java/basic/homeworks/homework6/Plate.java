package ru.otus.java.basic.homeworks.homework6;

public class Plate {
    private final int maximumAmountFood;
    private int currentAmountFood;

    public Plate(int maximumAmountFood) {
        this.maximumAmountFood = maximumAmountFood;
        currentAmountFood = maximumAmountFood;
    }

    public void addFood(int food) {
        if (food <= 0) {
            System.out.println("Введите число больше ноля");
            return;
        }
        if (food + currentAmountFood > maximumAmountFood) {
            System.out.println("Вы пытаетесь пополнить тарелку на большее количество еды чем она может содержать. " +
                    "В данный момент вы можете пополнить тарелку на " + (maximumAmountFood - currentAmountFood));
            return;
        }

        currentAmountFood += food;
        System.out.println("Вы пополнили тарелку на " + food);
    }

    public boolean removeFood(int food) {
        if (food > currentAmountFood) {
            System.out.println("Добавьте еду в тарелку, в тарелки меньше еды чем может скушать котик " + currentAmountFood);
            return false;
        }
        currentAmountFood -= food;
        return true;
    }
}
