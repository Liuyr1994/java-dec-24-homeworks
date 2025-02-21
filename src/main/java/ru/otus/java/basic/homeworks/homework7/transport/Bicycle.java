package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.Human;

public class Bicycle implements Transport {
    private Human human;

    @Override
    public boolean moveToDistance(int distance, TypesOfTerrain typesOfTerrain) {
        if (human.getPower() > distance * 2 && typesOfTerrain != TypesOfTerrain.SWAMP) {
            human.setPower(-distance * 2);
            System.out.println("Человек успешно преодолел дистанцию на велосепеде " + distance + " по местности " + typesOfTerrain);
        }
        System.out.println("Человек не смог преодолеть дистанцию в " + distance);
        return false;
    }
}
