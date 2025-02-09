package ru.otus.java.basic.homeworks.homework5.animal;

public abstract class Animal {
    private String name;
    private int runningSpeed = 1;
    private int swimmingSpeed;
    private int stamina = 200;

    public Animal(String name, int swimmingSpeed) {
        this.name = name;
        this.swimmingSpeed = swimmingSpeed;
    }

    public int run(int distance) {
        if (stamina - (distance * runningSpeed) > 0) {
            System.out.println(this.getClass().getSimpleName() + " по имени " + name + " смог пробежать: " + distance + " за " + distance * runningSpeed);
            stamina -= distance * runningSpeed;
            return distance * runningSpeed;
        }

        System.out.println(this.getClass().getSimpleName() + " по имени " + name + " не смог пробежать " + distance +
                " " +
                "у него " +
                "появилось " +
                "состояние усталости");
        return -1;
    }

    public int swim(int distance) {
        if (swimmingSpeed == 0) {
            System.out.println(this.getClass().getSimpleName() + " по имени " + name + " не умеет плавать.");
            return -1;
        }

        if (stamina - (distance * swimmingSpeed) > 0) {
            System.out.println(this.getClass().getSimpleName() + " по имени " + name + " смог проплыть: " + distance + " за " + distance * swimmingSpeed);
            stamina -= distance * swimmingSpeed;
            return distance * swimmingSpeed;
        }

        System.out.println(this.getClass().getSimpleName() + " по имени " + name + " не смог проплыть " + distance + " у него появилось " +
                "состояние усталости");
        return -1;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", runningSpeed=" + runningSpeed +
                ", swimmingSpeed=" + swimmingSpeed +
                ", stamina=" + stamina +
                '}';
    }
}
