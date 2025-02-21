package ru.otus.java.basic.homeworks.homework7;

import ru.otus.java.basic.homeworks.homework7.transport.Transport;
import ru.otus.java.basic.homeworks.homework7.transport.TypesOfTerrain;


public class Human {
    private String name;
    private Transport currentTransport;
    private int power;

    public Human(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Transport getCurrentTransotp() {
        return currentTransport;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void take(Transport transport) {
        this.currentTransport = transport;
        System.out.println(name + " сел на " + transport.getClass().getSimpleName());
    }

    public void standUp() {
        if (currentTransport != null) {
            System.out.println("Человек встал с транспорта " + currentTransport.getClass().getSimpleName());
            currentTransport = null;
            return;
        }
        System.out.println("Вы не находитесь ни на каком транспорте.");
    }

    public boolean move(TypesOfTerrain typesOfTerrain, int distance) {
        if (currentTransport != null) {
            return currentTransport.moveToDistance(distance, typesOfTerrain);
        }
        if (distance * 3 < power) {
            power -= distance * 3;
            System.out.println(name + " человек прошел пешком дистанцию " + (distance * 3));
            return true;
        }
        System.out.println("Человек не смог пройти дистанцию");
        return false;
    }
}
