package ru.otus.java.basic.homeworks.homework7.transport;

public class ATV implements Transport {
    private int fuel;

    public ATV(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean moveToDistance(int distance, TypesOfTerrain typesOfTerrain) {
        if (distance * 5 < fuel) {
            fuel -= distance * 5;
            System.out.println("Вездеход успешно прошёл дистанцию в " + distance + " по местности " + typesOfTerrain);
        }
        System.out.println("Вездеход не смог преодолеть дистанцию " + distance);
        return false;
    }
}
